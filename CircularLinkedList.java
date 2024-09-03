package com.simple.examples;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class CircularLinkedList {

	public static boolean isCircularList(Node head)
	{
		if(head == null)
		{
			return false;
		}
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null)
		{
		   slow = slow.next;
		   fast = fast.next.next;
		   if(slow == fast)
		   {
			   return true;
		   }
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
				head.next =second;
		second.next = third;
		third.next =head;
		
		System.out.println("The given linkedlist is cirular: "+isCircularList(head));
		
		Node head2 = new Node(1);
		Node second2 = new Node(2);
		Node third2 = new Node(3);
				head2.next =second2;
		second2.next = third2;
		//third.next =head;
		
		System.out.println("The given linkedlist is cirular: "+isCircularList(head2));
		
		
	}

}
