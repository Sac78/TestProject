package com.sac.date03_06_2022;

import java.util.HashMap;
import java.util.Map;

public class MapException {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "sac");
		map.put(2, "gh");
		System.out.println(map);
		
		Map<Integer,String> map1=new HashMap<Integer, String>();
		map1.put(2, "hin");
		map1.put(3, "kj");
		System.out.println(map.hashCode());
		System.out.println(map1.hashCode());
		try {
			
			if(map!=map1) {
				throw new ObjectNotSame("object is not same");
			}
		}
		catch (ObjectNotSame e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			System.out.println(map);
			System.out.println(map1);
		}
	}

}
