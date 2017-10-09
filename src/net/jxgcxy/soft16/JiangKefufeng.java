package net.jxgcxy.soft16;

import java.util.Scanner;

public class JiangKefufeng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String jixu="";
		int xuanxiang;
		do {
			   xuanxiang=0;
				System.out.println("*****欢迎进入奖客富翁系统*****\n"
						+ "1.注册\n2.登录\n3.抽奖\n"
						+ "********************************\n"
						+ "请选择菜单：");
				xuanxiang=xuanxiang(input,xuanxiang);
				jieguo(xuanxiang);
				System.out.println("是否继续输入（是：Y/否：其他字符）：");//运行到这里结束了？？
			   jixu=jixu(input,jixu);//没有进入jixu方法，跳过了
		}while(jixu.equals("Y"));
        System.out.println("程序结束，谢谢使用！");
		input.close();
			
		}
		
	 
	
	public static int  xuanxiang(Scanner input,int xuanxiang) {
		xuanxiang=input.nextInt();
		 return xuanxiang;
	}
	public static String jixu(Scanner input,String jixu) {//没走这里
				 jixu=input.next();
		 return jixu;
	}
	public static void jieguo(int xuanxiang) {
		switch (xuanxiang) {
		case 1:
			System.out.println("[奖客富翁系统>注册]");
			break;
		case 2:
			System.out.println("[奖客富翁系统>登录]");
			break;
		case 3:
			System.out.println("[奖客富翁系统>抽奖]");
			break;

		default:
			System.out.println("您的输入有误！");
			break;
		}
	}

}
