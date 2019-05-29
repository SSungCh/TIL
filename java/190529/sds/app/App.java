package com.sds.app;

import java.util.Scanner;

import com.sds.component.UserBiz;
import com.sds.frame.Biz;
import com.sds.vo.User;

public class App {

	public static void main(String[] args) {
		Biz<String,User> biz = new UserBiz();
		User u1 = new User();
		Scanner sc = new Scanner(System.in);
		out: while (true) {
			System.out.println("MENU :r,g,q..");
			String cmd = sc.next();
			switch (cmd) {
			case "r":
				System.out.println("Input User Info");
				String id = sc.next();
				String name = sc.next();
				String pwd = sc.next();
				u1.setName(name);
				u1.setId(id);
				u1.setPwd(pwd);
				
				try {
					biz.register(u1);
				} catch (Exception e) {
					System.out.println("Insert Error");
					System.out.println(e.getMessage());

				}
				break;
			case "g":
				System.out.println("Input ID");
				String id2 = sc.next();
				User user = null;
				try {
					user=biz.get(id2);
					System.out.println(user);
				} catch (Exception e) {
					System.out.println("Get Error");
					System.out.println(e.getMessage());
				}
				break;
			case "q":
				System.out.println("Bye...");
				break out;
			default:
				System.out.println("다시 입력하세요...");
				break;
			}

		}
		sc.close();

	}

}
