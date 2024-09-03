package com.simple.examples;

//import java.util.LinkedList;

//Use this editor to write, compile and run your Java code online
//class Node{
// int data;
// Node next;
// 
// Node(int data){
// this.data =data;
// this.next= null;
//}
//}


class CircularList {
Node head;

public boolean isCircular()
{
    if(head == null)
    {
        return false;
    }
    Node n1 = head;
    Node n2 = head;
    while(n1 !=null && n2.next!=null)
    {
        n1=n1.next;
        n2 = n2.next.next;
    }
    if(n1 == n2)
    {
        return true;
    }
     return false;
}

public void add(int data)
{
    Node newNode = new Node(data);
    if(head==null)
    {
        head= newNode;
        return;
    }
     Node currentNode = head;
    while(currentNode.next !=null)
    {
        currentNode = currentNode.next;
    }
    currentNode.next=newNode;
}
@SuppressWarnings("null")
public void createLoop(int position)
{
    if(head==null)
    {
        return;
    }

Node loopNode = head;
for(int i=0;i<position;i++)
{
    loopNode=loopNode.next;
}
Node current =head;
try {
while(current != null)
{
    current =current.next;
}
  current.next = loopNode;
}catch(Exception e)
{
	e.printStackTrace();
}
}

public static void main(String[] args)
{
	CircularList list = new CircularList();
   list.add(1);
     list.add(2);
       list.add(3);
         list.add(4);
        // list.add(1);
         
         list.createLoop(3);
         if(list.isCircular())
         {
             System.out.println("The given linkedlist is cirular");
             
         }else
         {
              System.out.println("The given linkedlist is not cirular");
             
         }
 }
}


