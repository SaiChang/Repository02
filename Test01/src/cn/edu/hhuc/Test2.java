package cn.edu.hhuc;

public class Test2 {
	
	
	public static void main(String[] args) {
//		numberPatternPrint(5);
		for(int i = 1; i<20; i++){
			System.out.println(Fibonacci(i));
		}
		
	}
	
	public static void numberPatternPrint(int n)
	{
		int lenth = ((1+n)*n)/2;
		int max = lenth;
//		int j = 1;
		int start=1;
		int end=0;
		for(int j = 1; j<=n;j++)
		{
			int[] a = new int[j];
			
			if(0 == j%2)
			{
				//偶数
				for(int m=0;m<a.length;m++)
				{
					a[m]=end-m;
				}
				start = a[0]+1;
				end = a[0]+j+1;
			}
			else
			{
//				奇数，正序打印
				for(int m=0;m<a.length;m++)
				{
					a[m]=start+m;
				}
				start = a[j-1]+1;
				end = a[j-1]+j+1;
			}
			
			for(int m = 0;m<a.length;m++)
			{
				System.out.print(a[m]);
				if(m != a.length-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.println();
				}
			}
			
//			start = a[j-1]+1;
//			end = a[j-1] + j+1; 	
//			j++;
			
		}
	}
//	public static int Fibonacci(int n) {
//        if(1 == n){
//            return 0;
//        }
//        if(2 == n){
//            return 1;
//        }
//        return Fibonacci(n-1)+Fibonacci(n-2);         
//
//    }
      public static int Fibonacci(int n) {
        
        int[] arr = new int[40];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i< 40; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
           
        
    }
	

}
