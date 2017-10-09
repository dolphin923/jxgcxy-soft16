/**
 * Project Name:fundamental
 * File Name:BookList.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年9月30日下午4:54:33
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
*/
/**
 * Project Name:fundamental
 * File Name:BookList.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年9月30日下午4:54:33
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
 */

package net.jxgcxy.soft16;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:BookList <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason:	 TODO ADD REASON. <br>
 * Date:     2017年9月30日 下午4:54:33 <br>
 * @author   wengouliang
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
/**
 * ClassName: BookList <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason: TODO ADD REASON(可选). <br>
 * date: 2017年9月30日 下午4:54:33 <br>
 *
 * @author wengouliang
 * @version 
 * @since JDK 1.6
 */
public class BookList {

	/**
	 * main:(这里用一句话描述这个方法的作用). <br>
	 * TODO(这里描述这个方法适用条件 – 可选).<br>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br>
	 *
	 * @author wengouliang
	 * @param args
	 * @since JDK 1.6
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String[] oldbooks = new String[]{"Computer","Hibernate","Java", "Struts"};
		String[] newbooks = new String[oldbooks.length+1];
		
		/**
		 * 调用数组复制方法
		 */
		System.arraycopy(oldbooks, 0, newbooks, 0, oldbooks.length);
		
		System.out.println("Please input a word:");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		
		/*
		newbooks[newbooks.length-1] = word;
		
		Arrays.sort(newbooks);*/
		
		/**
		 * 从数组的倒数第二个元素往前比较
		 */
		int i=newbooks.length-2;
		for(;i>=0;i--){
			if(word.compareToIgnoreCase(newbooks[i])>0){
				break;
			} else {
				newbooks[i+1] = newbooks[i];
			}
		}
		newbooks[i+1] = word;
		
		for(int j=0;j<newbooks.length;j++){
			System.out.print(" "+newbooks[j]);
		}
		scanner.close();
	}

}

