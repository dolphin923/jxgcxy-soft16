/**
 * Project Name:yanshixiangmu
 * File Name:DirectTriangle.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年10月9日上午11:22:01
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
*/
/**
 * Project Name:yanshixiangmu
 * File Name:DirectTriangle.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年10月9日上午11:22:01
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
 */

package net.jxgcxy.soft16;

import java.util.Scanner;

/**
 * ClassName:DirectTriangle <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason:	 TODO ADD REASON. <br>
 * Date:     2017年10月9日 上午11:22:01 <br>
 * @author   wengouliang
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
/**
 * ClassName: DirectTriangle <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason: TODO ADD REASON(可选). <br>
 * date: 2017年10月9日 上午11:22:01 <br>
 *
 * @author wengouliang
 * @version 
 * @since JDK 1.6
 */
public class DirectTriangle {

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
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入直角三角形的行数:");
		int row = scanner.nextInt();
		for(int i=0;i<row;i++){
			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.println();
//			System.out.print("\n");
		}
		scanner.close();
	}

}

