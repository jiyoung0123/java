package db;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// interface도 객체생성 안된다. 추상class와 마찬가지로.왜냐하면, 실체가 없으니깐...
		DAO dao = new MariaDBDAO();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input name...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				dao.insert(user);
			} 
			else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				String id = sc.next();
				dao.delete(id);

			} 
			else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input name...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				dao.update(user);

			}
		}

	}

}
