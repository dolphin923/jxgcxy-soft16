
package net.jxgcxy.soft16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author wengouliang
 *
 */
public class LuckyDraw {

	private static Scanner scanner = new Scanner(System.in);
	private static String userName = "";
	private static String userPwd = "";
	private static int memberNo = 0;
	private static boolean isReg = false;
	/**
	 * @param args 程序参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flag = "";
		do {
			System.out.println("*******欢迎进入奖客富翁系统*******");
			System.out.println("\t1.注册\t");
			System.out.println("\t2.登录\t");
			System.out.println("\t3.抽奖\t");
			System.out.println("*********************************");
			System.out.print("请选择菜单:");
			
			if(scanner.hasNextInt()){
				int i = scanner.nextInt();
				switch(i){
				case 1:
					System.out.println("[奖客富翁系统> 注册]");
					regMember();
					break;
				case 2:
					System.out.println("[奖客富翁系统> 登录]");
					login();
					break;
				case 3:
					System.out.println("[奖客富翁系统> 抽奖]");
					draw();
					break;
				default:
					System.out.println("您的输入有误！");
				}
			} else {
				String errMsg = scanner.next();
				System.err.println("您的输入有误,非法字符="+errMsg);
			}
			System.out.print("继续吗?(y/n):");
			flag = scanner.next();
		} while("y".equals(flag));
		
		System.out.println("\n系统退出，谢谢使用!");
		scanner.close();
	}
	
	public static void regMember(){
		System.out.println("请填写个人注册信息:");
		System.out.print("用户名:");
		userName = scanner.next();
		System.out.print("密码:");
		userPwd = scanner.next();
		
		memberNo = generateRnd();
		isReg = true;
		System.out.println("\n注册成功,请填好您的会员卡号");
		System.out.println("用户名\t密码\t会员卡号");
		System.out.println(userName+"\t"+userPwd+"\t"+memberNo);
	}
	
	public static void login(){
		for(int i=2;i>=0;i--){
			System.out.print("请输入用户名:");
			String uname = scanner.next();
			System.out.print("请输入密码:");
			String upwd = scanner.next();
			
			if(userName.equals(uname)&&userPwd.equals(upwd)){
				System.out.println("\n欢迎您:"+userName);
				break;
			} else {
				System.out.println("输入账号或密码错误，您还有"+i+"次登录机会!");
			}
		}
		
	}
	
	public static void draw(){
		System.out.print("请输入您的卡号:");
		int memno = scanner.nextInt();
		
		int[] luckyDigits = new int [5];
		for(int i=0;i<luckyDigits.length;){
			int r =  generateRnd();
			int pos = Arrays.binarySearch(luckyDigits, r);
			if(pos<0){
				luckyDigits[i] = r;
			} else {
				continue;
			}
			i++;
		}
		
		System.out.print("本日的幸运数字为:");
		for(int i=0;i<luckyDigits.length;i++){
			System.out.print(luckyDigits[i]+" ");
		}
		
		int pos2 = Arrays.binarySearch(luckyDigits, memno);
		if(pos2<0){
			System.out.println("\n抱歉！您不是本日的幸运会员！");
		} else {
			System.out.println("\n恭喜您！您是本日的幸运会员！");
		}
		
	}
	/**
	 * 随机生成会员号
	 * @return
	 */
	public static int generateRnd(){
		Random random = new Random();
		do {
			int r = random.nextInt(10000);
			if(r>=1000&&r<10000){
				return r;
			}
		}while(true);
	}

}

class RegInfo {
	private String userName;
	private String userPwd;
	private int memberNo;
	private boolean isReg;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public boolean isReg() {
		return isReg;
	}
	public void setReg(boolean isReg) {
		this.isReg = isReg;
	}
}
