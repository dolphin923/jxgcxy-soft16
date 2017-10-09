package net.jxgcxy.soft16;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int memberNo = generateRnd();
		System.out.println("memberNo="+memberNo);
	}
	
	/**
	 * 随机生成会员号
	 * @return 随机生成的会员号
	 */
	public static int generateRnd(){
		Random random = new Random();
		do {
			int r = random.nextInt(10000);
			if(r>=1000&&r<10000){
				System.out.println("r="+r);
				return r;
			}
		}while(true);
		
	}

}
