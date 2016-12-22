package cn.edu.hhuc;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
public class Solution {
	public static void main(String[] args) {
		int[] arr = {1,2,4,7,11,16,29,36,57};
		System.out.println(new Solution().FindNumbersWithSum(arr,52));
	}
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if(array.length < 2){
            return new ArrayList<Integer>();
        }
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr1;
        Map<Integer,Object> map = new HashMap<Integer,Object>();
        for(int i = 0; i<array.length; i++){
            map.put(array[i],null);
        }
        for(int i = 0; i<array.length; i++){
            int val1 = array[i];
            int val2 = sum - val1;
            boolean tof = map.containsKey(Integer.valueOf(val2));
            if(true == tof){
                arr1 = new ArrayList<Integer>();
                if(val1 < val2){
                    arr1.add(val1);
                	arr1.add(val2);
                }else{
                    arr1.add(val2);
                    arr1.add(val1);
                }
                arr1.add(val1*val2);
                arr.add(arr1);
            }
        }
        if(0 == arr.size()){
            return new ArrayList<Integer>();
        }else{
            Collections.sort(arr,new newComparator());
            ArrayList<Integer> arr2 = arr.get(0);
            arr2.remove(2);
            return arr2;
        }
    }
}
class newComparator implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        int value1 = arr1.get(2);
        int value2 = arr2.get(2);
        if(value1 > value2){
            return 1;
        }else{
            return -1;
        }
    }

}
