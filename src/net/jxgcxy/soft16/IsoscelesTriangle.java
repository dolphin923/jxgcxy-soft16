/**
 * Project Name:yanshixiangmu
 * File Name:IsoscelesTriangle.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年10月8日下午11:42:04
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
*/

package net.jxgcxy.soft16;

import java.util.Scanner;

/**
 * ClassName:IsoscelesTriangle <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason:	 TODO ADD REASON. <br>
 * Date:     2017年10月8日 下午11:42:04 <br>
 * @author   wengouliang
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class IsoscelesTriangle {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入等腰三角形的行数:");
		while(!scanner.hasNextInt()){
			String errLetter = scanner.next();
			System.out.print("输入错误字符--"+errLetter+"!\n请输入等腰三角形的行数:");
		}
		int row = scanner.nextInt();
		for(int i=0;i<row;i++){
			//打印空格
			for(int k=i+1;k<row;k++){
				System.out.print(" ");
			}
			//打印星号
			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scanner.close();

	}

}

