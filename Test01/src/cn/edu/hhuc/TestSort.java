package cn.edu.hhuc;

public class TestSort {
	
	public static void main(String[] args) {
		
		int[] a = {2,3,1,7,56,32,15,131,36};
		selectSort(a);
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void selectSort(int[] a){
//		选择排序
		int n = a.length;
		int temp;//每次排序时，暂放最小的数
		int flag;//每次排序时，暂放最小数的下标
		
		for(int i = 0; i < n; i++){
			temp = a[i];
			flag = i;
			for(int j = i+1; j<n; j++){
				if(a[j]<temp){
					temp = a[j];
					flag = j;
				}
			}
			if(flag != i){
				a[flag] = a[i];
				a[i] = temp;
			}
		}
		
	}

}
