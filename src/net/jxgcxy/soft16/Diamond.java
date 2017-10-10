/**
 * Project Name:fundamental
 * File Name:Diamond.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年10月9日下午10:33:43
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
*/

package net.jxgcxy.soft16;

import java.util.Scanner;

/**
 * ClassName:Diamond <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason:	 TODO ADD REASON. <br>
 * Date:     2017年10月9日 下午10:33:43 <br>
 * @author   wengouliang
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Diamond {

	public static void main(String[] args){
		printDiamond2();
	}
	
	public static void printDiamond(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入菱形行数:");
		int row = scanner.nextInt();
		while(row%2==0){//输入的不是奇数
			System.out.print("请输入奇数:");
			row = scanner.nextInt();
		}
		int mid = (row+1)/2;
		for(int i=0;i<row;i++){
			int mode = i>=mid?(row-1-i):i;
			for(int j=0;j<mid-1-mode;j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*mode+1;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scanner.close();
	}
	
	public static void printDiamond2(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入菱形行数:");
		int row = scanner.nextInt();
		while(row%2==0){//输入的不是奇数
			System.out.print("请输入奇数:");
			row = scanner.nextInt();
		}
		int mid = row/2;//假设行号从0~row-1,mid就是中间的行号
		for(int i=0;i<row;i++){
			/**
			 * 计算左边空格数
			 */
			int blankNum = Math.abs(mid - i);
			for(int j=0;j<blankNum;j++){
				System.out.print(" ");
			}
			/**
			 * 计算星号数
			 */
			int starNum = row - 2*blankNum;
			for(int j=0;j<starNum;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scanner.close();
	}
}

