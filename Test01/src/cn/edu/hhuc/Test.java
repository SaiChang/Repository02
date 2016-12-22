package cn.edu.hhuc;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		LNode l1 = new LNode();
		LNode l2 = new LNode();
		LNode l3 = new LNode();
		LNode l4 = new LNode();
		LNode l5 = new LNode();
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;
		
		l1.value = 11;
		l2.value = 23;
		l3.value = 16;
		l4.value = 9;
		l5.value = 21;
		
		LNode test = reverseLinkedList(l1);
		
		while(true)
		{
			System.out.println(test.value);
			if(null == test.next)
			{
				break;
			}
			else
			{
				test = test.next;
			}
		}
		
	}
	
	public static LNode reverseLinkedList(LNode list)
	{
//		list是链表的头节点
		if(list == null)
		{
			return null;
		}
		
		ArrayList<LNode> arr = new ArrayList<LNode>();
		
		
		LNode head = list;
		LNode a = list;
		int length = 0;
		while(true)
		{
			arr.add(a);
			if(null == a.next)
			{
				break;
			}
			else
			{
				a = a.next;
			}
		}
		length = arr.size();
		
		int index = 0;
		if(0==length%2)
		{
//			偶数
			index = length/2 -1;
		}
		else
		{
//			奇数
			index = (length+1)/2 - 2;
		}
		
		arr.get(index).next = arr.get(length-1);
		arr.get(index+1).next = null;
		for(int i = length-1; i > index+1;i--)
		{
			arr.get(i).next = arr.get(i-1);
		}
		
		return head;
			
		
	}

}
