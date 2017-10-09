package net.jxgcxy.soft16;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LoopInputMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("MyShopping管理系统> 客户信息管理> 添加客户信息");
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("\n请输入会员号(<4位整数>):");
			int memberNo = scanner.nextInt();
			System.out.print("请输入会员生日(月/日<用两位整数表示>):");
//			scanner.useDelimiter("/");
			String date = scanner.next();
		/*	int month = 0;
			int day = 0;
			while(scanner.hasNextInt()){
				month = scanner.nextInt();
				day = scanner.nextInt();
			}*/
			
			System.out.print("请输入会员积分:");
			int memberIntegral = scanner.nextInt();
			
			if(memberNo<1000&&memberNo>=10000){
				System.out.println("客户号"+memberNo+"是无效会员号!\n录入信息失败");
				continue;
			}
			if(!Pattern.matches("(0[1-9]|1[0-2])\\/(0[1-9]|[12][0-9])|(0[13-9]|1[0-2])\\/30|(0[13578]|1[02])\\/31", date)){
				System.out.println("生日"+date+"是无效日期!\n录入信息失败");
				continue;
			}
			System.out.println("您录入的会员信息是:");
			System.out.printf("%d %s %d", memberNo, date, memberIntegral);
		}
		
		scanner.close();
	}

}
