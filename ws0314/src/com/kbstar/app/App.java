package com.kbstar.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----   Shop Mall Program -----");
			System.out.println("Login(l) or Register(r) (q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			}else if(cmd.equals("r")) {
				System.out.println("Register.. ");
				
				try {
					
					System.out.println("환영합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("l")) {
				System.out.println("Login.. ");
				System.out.println("ID를 입력 하세요.. ");
				String id = sc.next();
				System.out.println("PWD를 입력 하세요.. ");
				String pwd = sc.next();
				
				try {
					
					
					System.out.println("로그인 성공");
					System.out.println("----------------------------");
					while(true) {
						System.out.println("Menu(사용자정보조회(c),상품조회(it),카트입력(i),카트조회(ci),나가기(e))...");
						String cmn = sc.next();
						if(cmn.equals("e")) {
							System.out.println("Logout...");
							break;
						}else if(cmn.equals("c")) {
							System.out.println("사용자정보조회...");
							
						}else if(cmn.equals("it")) {
							System.out.println("상품조회");
							
						}else if(cmn.equals("i")) {
							System.out.println("카트입력");
							
						}else if(cmn.equals("ci")) {
							System.out.println("나의 카트조회...");
							
							
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					//e.printStackTrace();
				}
			}
		}
		sc.close();
	}}




