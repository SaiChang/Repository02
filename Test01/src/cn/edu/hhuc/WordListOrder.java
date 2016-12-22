package cn.edu.hhuc;

public class WordListOrder {
	
	
	
	
	public static void main(String[] args) {
		String[] str1 = {"abcd","defg","ghij","jkl"};
		String[] str2 = {"abc","cde","efg","klm"};
		System.out.println(canArrangeWords(str1));
		System.out.println(canArrangeWords(str2));
//		System.out.println("hello".charAt(0));
	}
	
	public static int canArrangeWords(String arr[])
	{
		for(int i = 0;i<arr.length-1;i++)
		{
			int l = arr[i].length();
			char a = arr[i].charAt(l-1);
			char b = arr[i+1].charAt(0);
			if(a != b)
			{
				return -1;
			}
	    }
		
		return 1;
	}

}
