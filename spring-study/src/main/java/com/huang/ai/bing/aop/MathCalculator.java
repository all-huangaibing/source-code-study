package com.huang.ai.bing.aop;

import org.springframework.stereotype.Component;

/**
 * 功能：
 *
 * @author huangaibing
 * @date 2019/10/15 9:39
 */
@Component
public class MathCalculator {
	
	public int div(int i,int j){
		System.out.println("MathCalculator...div...");
		return i/j;	
	}

}