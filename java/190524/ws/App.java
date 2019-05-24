package ws;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "";
		String pw = "";
		String account = "";
		int usermoney = 0;
		int usernumber[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("ID�� �Է��ϼ���: ");
		id = sc.nextLine();
		System.out.println("PW�� �Է��ϼ���: ");
		pw = sc.nextLine();
		System.out.println("���¸� �Է��ϼ���: ");
		account = sc.nextLine();
		System.out.println("�Ա��� ���� �Է��ϼ���: ");
		usermoney = sc.nextInt();

		User user = new User(id, pw, account, usermoney);

		while (true) {

			System.out.println("ID�� �Է��ϼ���: ");
			String id1 = sc.next();

			System.out.println("PW�� �Է��ϼ���: ");
			String pw1 = sc.next();
			if (user.UserInfo(id1, pw1) == true) {
				break;
			}
			
		}
		System.out.println("�ζǹ�ȣ�� 6�ڸ��� �Է��ϼ���:");
		for (int i = 0; i < usernumber.length; i++) {
			usernumber[i] = sc.nextInt();
		}
		System.out.println("���Ӻ� �Է��ϼ���:");

		double gamemoney = sc.nextDouble();

		try {
			user.setBalance(user.withdraw(gamemoney));

		} catch (Exception e) {
			System.out.println("�ܰ� �����մϴ�.");
		}

		user.lotto.GenerateNum();
		System.out.println(user.getBalance());
		System.out.println(Arrays.toString(user.lotto.getComNumber()));
		int count = user.lotto.CompareNum(usernumber);
		System.out.println("��������:" + count);
		double money = user.lotto.Money(gamemoney, count); // count = ��÷ ���� ����
		System.out.println("��÷��:" + money);
		user.setBalance(user.deposit(money));
		System.out.println("�ܾ�:" + user.getBalance());
		sc.close();
	}

}
