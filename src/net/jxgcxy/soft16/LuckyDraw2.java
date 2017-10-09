/**
 * 
 */
package net.jxgcxy.soft16;

import java.util.Scanner;

/**
 * @author wengouliang
 *
 */
public class LuckyDraw2 {

	/**
	 * @param args 程序参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	
		String flag = "";
		do {
			System.out.println("*******欢迎进入奖客富翁系统*******");
			System.out.println("\t1.注册\t");
			System.out.println("\t2.登录\t");
			System.out.println("\t3.抽奖\t");
			System.out.println("*********************************");
			System.out.print("请选择菜单:");
			
			String sel = scanner.next();
			switch(sel){
			case "1":
				System.out.println("[奖客富翁系统> 注册]");
				break;
			case "2":
				System.out.println("[奖客富翁系统> 登录]");
				break;
			case "3":
				System.out.println("[奖客富翁系统> 抽奖]");
				break;
			default:
				System.out.println("您的输入有误,非法字符="+sel);
			}
			System.out.print("继续吗?(y/n):");
			flag = scanner.next();
		} while("y".equals(flag));
		
		System.out.println("\n系统退出，谢谢使用!");
		scanner.close();
	}

}
