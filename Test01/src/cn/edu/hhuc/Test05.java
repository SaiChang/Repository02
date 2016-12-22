package cn.edu.hhuc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Test05 {
	
	public static void main(String[] args) {
//		String str = "12345";
//		String[] arr = str.split(" ");
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(110);
//		arr.add(21);
//		arr.add(32);
//		arr.add(13);
//		arr.add(400);
//		arr.add(50);
//		System.out.println(arr);
//		arr.remove(3);
//		System.out.println(arr.get(index));
//		System.out.println(arr.contains(6));
//		System.out.println(arr.indexOf(32));
//		arr.remove(1);
//		System.out.println(arr.indexOf(32));
		int[] array = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
		new Test05().method04(array);
		int[] array02 = {1,2,3,4,5};
		int[] array03 = {1,2,3,4,5};
		
		
		
	}
	
	public void method02(int[] array){
			ArrayList<Integer> arr = new ArrayList<Integer>();
	       //HashMap<Integer,Integer> map02 = new HashMap<Integer,Integer>();
	        int len = array.length;
	        for(int i=0; i<len; i++){
	            arr.add(array[i]);
	        }
	        Collections.sort(arr);
	        
	        int sum = 0;
	        for(int i = 0; i<len-1; i++){
	            int index = arr.indexOf(array[i]);
	            sum = sum + index;
	            arr.remove(index);
	        }
	        System.out.println(sum%1000000007);
	}
	public void method03(int[] array){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int len = array.length;
		int[] array02 = Arrays.copyOf(array,len);
		int[] realIndex = new int[len];
		Arrays.sort(array02);
		
		for(int i = 0; i<len; i++){
			map.put(array02[i],i);//用来存放排序后的每个元素的下标
			realIndex[i] = i;//用来存放排序数组被操作后，第i个元素此时的下标还是i，但是其真正的索引数就不是了
		}
		int sum = 0;
		for(int i = 0; i<len-1; i++){
			int j = map.get(array[i]);
			int index = realIndex[j];
			sum = sum + index;
			
			for(int k = j; k<len; k++){
				realIndex[k] = realIndex[k]-1;
			}
		}
		System.out.println(sum);
		
	}
	public void method04(int[] array){
		int len = array.length;
		int[] array02 = Arrays.copyOf(array,len);
		Arrays.sort(array02);
		int[] indexArr = new int[array02[len-1]+1];
		int[] realIndex = new int[len];
		for(int i = 0; i<len; i++){
			indexArr[array02[i]] = i;
			realIndex[i] = i;
		}
		int sum = 0;
		for(int i = 0; i<len-1; i++){
			int j = indexArr[array[i]];
			int index = realIndex[j];
			sum = sum + index;
			
			for(int k = j+1; k<len; k++){
				realIndex[k]--;
			}
		}
		System.out.println(sum);
	}

}
