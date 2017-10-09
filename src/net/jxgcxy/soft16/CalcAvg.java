/**
 * Project Name:fundamental
 * File Name:CalcAvg.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年10月9日上午9:29:33
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
*/
/**
 * Project Name:fundamental
 * File Name:CalcAvg.java
 * Package Name:net.jxgcxy.soft16
 * Date:2017年10月9日上午9:29:33
 * Copyright (c) 2017, wengouliang@qq.com All Rights Reserved.
 *
 */

package net.jxgcxy.soft16;

import java.util.Scanner;

/**
 * ClassName:CalcAvg <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason:	 TODO ADD REASON. <br>
 * Date:     2017年10月9日 上午9:29:33 <br>
 * @author   wengouliang
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
/**
 * ClassName: CalcAvg <br>
 * Function: TODO ADD FUNCTION. <br>
 * Reason: TODO ADD REASON(可选). <br>
 * date: 2017年10月9日 上午9:29:33 <br>
 *
 * @author wengouliang
 * @version 
 * @since JDK 1.6
 */
public class CalcAvg {

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
		double score[] = new double [4];
		double sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入4位学员的成绩:");
		for(int i=0;i<score.length;i++){
			System.out.print("第"+(i+1)+"学员的成绩:");
			score[i] = scanner.nextDouble();
			sum += score[i];
		}
		System.out.println("参赛学员的平均分是:"+(sum/score.length));
		scanner.close();

	}

}

