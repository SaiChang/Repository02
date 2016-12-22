package cn.edu.hhuc;

import java.util.ArrayList;

public class Test03 {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		array.add(arr);
		System.out.println(array);
		arr.clear();
		System.out.println(array);
		arr.add("5");
		arr.add("6");
		arr.add("7");
		array.add(arr);
		System.out.println(array);
		arr.remove(0);
		System.out.println(array);
		
		
	}
	
	public void test(ArrayList<String> arr){
		arr.remove(0);
	}

}
