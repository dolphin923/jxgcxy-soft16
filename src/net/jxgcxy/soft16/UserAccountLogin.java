package net.jxgcxy.soft16;

import java.util.Scanner;

public class UserAccountLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "jin",password = "123456";
		Scanner scanner = new Scanner(System.in);
		for(int i=2;i>=0;i--){
			System.out.println("请输入用户名:");
			String iname = scanner.next();
			System.out.println("请输入密码:");
			String pwd = scanner.next();
			if(name.equals(iname)&&password.equals(pwd)){
				System.out.println("欢迎登录MyShopping系统!\n");
				break;
			} else {
				System.out.println("输入错误!您还有"+i+"次机会！\n");
			}
		}
		scanner.close();
	}

}
