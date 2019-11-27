package com.test.corejava.puzzle;

import com.test.corejava.puzzle.LinkedList.Node;

/* remove duplicate Object from linkedList*/
public class LinkedListDuplicate {
    
    
    public static void main(String[] args) {
        
        LinkedList linkedList=new LinkedList();
        linkedList.head=new Node(8);
        linkedList.head.next=new Node(12);
        linkedList.head.next.next = new Node(11); 
        linkedList.head.next.next.next = new Node(11); 
        linkedList.head.next.next.next.next = new Node(12); 
        linkedList.head.next.next.next.next.next = new Node(11); 
        linkedList.head.next.next.next.next.next.next = new Node(10); 
        
        System.out.println("Linked List initial is :->");
        linkedList.printLinkedList(linkedList);
        
        linkedList.removeDuplicate();
        
        System.out.println("Linked List after removing Duplicate is :->");
        linkedList.printLinkedList(linkedList);
        
    }

}


class LinkedList { 
    
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
    
    public void removeDuplicate(){
        
        Node ptr1,ptr2;
        
        int firstElement;
        ptr1=head;
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1; 
            while(ptr2.next!=null)
            {
                if(ptr1.data==ptr2.next.data)
                {
                    System.out.println("found duplicate"+ptr1.data);
                    ptr2.next=ptr2.next.next;
                }
                else{
                    ptr2=ptr2.next;
                }
            }
        ptr1=ptr1.next;    
        }
        
    }
    
    
    public void printLinkedList(LinkedList list)
    {
        Node node=list.head;
        while(node.next!=null){
            System.out.println("element is "+node.data);
            
           node=node.next;
        }
    }
}
