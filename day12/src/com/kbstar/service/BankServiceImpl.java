/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author 82104
 *
 */
public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String,UserDTO> userDao;
	DAO<String,AccountDTO> accountDao;	
	DAO<String, TransactionDTO> transactionDao;
	Notification notification;
	
	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		notification = new NotificationImpl();
		transactionDao = new TransactionDAO();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try{
		   userDao.insert(v);
		}catch(Exception e) {
			throw new Exception();
		}notification.sendEmail(v.getEmail(), "축하합니다.");
		notification.sendSMS(v.getContact(), "축하합니다.");		
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		if(user!=null) {
			if(user.getPwd().equals(p)) {
				System.out.println("OK");
			}else {
				throw new Exception("로그인실패...");
			}
		}else {
			throw new Exception("로그인실패...");
		}
		return user;			
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(accNo, balance, k);
		accountDao.insert(account);
		
		UserDTO user = userDao.select(k);
		notification.sendEmail(user.getEmail(), accNo+"계좌를 생성 하셨습니다.");
		notification.sendSMS(user.getContact(), accNo+"계좌를 생성 하셨습니다.");
		
		
	}

	
	@Override
	public List<TransactionDTO> getAlltr(String acc) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
            System.out.println("금결원 전송..");
            AccountDTO acc = null;
            acc = accountDao.select(sendAcc);
            double abalance = acc.getBalance() - balance;
            acc.setBalance(abalance);
            accountDao.update(acc);
            
            //거래내역 추가
            TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, abalance, "O", desc);
            transactionDao.insert(tr);
                       
            //SMS, email 전송
            String uid = acc.getHolder();
            UserDTO u = userDao.select(uid);
            notification.sendEmail(u.getEmail(), sendAcc +"에서" + balance+"이체가 완료되었습니다.");
            notification.sendSMS(u.getContact(), sendAcc +"에서" + balance+"이체가 완료되었습니다.");            			
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
