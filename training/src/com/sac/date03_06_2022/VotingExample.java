package com.sac.date03_06_2022;

public class VotingExample {


	
	public void checkVotingCriteria(int number) {
		if(number<18) {
			throw new InvalidAgeException("This is person is not eligible for vote\n due to he is less than 18");
		}
		else {
			System.out.println("He is elgible to vote because his age "+number);
		}
		
	}
	public static void main(String[] args) {
	
		
		String s=null;
		if(s==null)
		{
			throw new NullPoint();
		}
		else
		{
			System.out.println("no exception");
		}
		VotingExample ex=new VotingExample();
		/*
		 * try { ex.checkVotingCriteria(21);
		 * 
		 * }catch (ArithmeticException | InvalidAgeException e){
		 * 
		 * // TODO: handle exception e.printStackTrace(); }
		 * 
		 * 
		 * catch( Exception e) { e.printStackTrace(); }
		 * 
		 */
		ex.checkVotingCriteria(20);
	}

}
