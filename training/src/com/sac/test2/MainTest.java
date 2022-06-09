package com.sac.test2;

public class MainTest {

	public static void main(String[] args) {
		Bottle bot=new Bottle();
		bot.isMade();
		bot.use();
		
		SteelBottles sb=new SteelBottles();
		sb.isMade();
		sb.use();

		/*
		 * Select  * from employee where sal=(select Max(sal) from employee where sal<(Select Max(sal) from employee))
		 * 
		 */
	}

}
