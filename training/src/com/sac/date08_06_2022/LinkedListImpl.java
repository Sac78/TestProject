package com.sac.date08_06_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListImpl {


	static List<String> list=new  LinkedList<String>();

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void addElement(int n) throws IOException {
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the "+i+" element");
			list.add(br.readLine());
		}
	}
	public static void addAtIndex(int index,String value) {
		
		list.add(index, value);
	}
	
	public static void removeElement(int index) {
		if(index<=list.size()) {
		list.remove(index);
		}
		else {
			System.out.println("There is no element to be removed");
		}
	}
	public static void updateListElement(String value) throws IOException {
		
	
		
		for(int i=0;i<list.size();i++) {
	
			if(list.get(i).equals(value)) {
				removeElement(i);
				System.out.println("Enter the value of the updated one");
				addAtIndex(i, br.readLine());
				break;
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		boolean isFlag=true;
		
		while(isFlag) {
			System.out.println(" 1:Adding an Element ");
			System.out.println(" 2:updating an Element ");
			System.out.println(" 3:deleting  an Element ");
			System.out.println(" 4:Adding at particulat index");
			System.out.println(" 5: End \n\n");
			
			System.out.println("Enter your choice");
			int choice=Integer.parseInt( br.readLine());
			switch(choice) {
			case 1:{
				System.out.println("How many element you want to add");
				int n=Integer.parseInt( br.readLine());
				if(n>0) {
					addElement(n);
					System.out.println(list);
					
				}
				else {
					System.out.println("No value has been entered");
					System.out.println(list);
				}
				break;
			}
			case 2:{
				System.out.println("Enter the value you want to update");
				String str=br.readLine();
				updateListElement(str);
				System.out.println(list);
				break;
					}
			case 3:{
				System.out.println("Enter the index you want to delete");
				int index=Integer.parseInt( br.readLine());
				removeElement(index);
				System.out.println(list);
				break;
				}
			case 4:{
				System.out.println("Enter the index");
				int index=Integer.parseInt( br.readLine());
				System.out.println("Enter the value");
				String value=br.readLine();
				
				addAtIndex(index, value);
				System.out.println(list);
				break;
			}
			case 5 :{
				System.out.println("Thank you for using this");
				isFlag=false;
			
			}
			}
		}
	}

}
