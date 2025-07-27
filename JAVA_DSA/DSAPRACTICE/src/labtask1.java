import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class labtask1 {
   // Question 1
   // The Caesar Cipher Technique

   public static void cipherText(String c, int b){
      char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      String temp="";
   int x=0;
      int len = c.length();
      String a = c.toUpperCase();
     
      for(int i = 0; i<len;i++)
      {
         if(Character.isAlphabetic(a.charAt(i)))
         {
        for (int j =0; j<26;j++)
        {
         if(a.charAt(i)==alphabets[j])
         {
            x=j;
         }
       
        }
   
        temp = temp+alphabets[(x+b)%26];
      }
      else{
         System.out.println("Invalid Input");
      }
      }
      System.out.println("Resultant Cipher text is :");
      System.out.println(temp);
   }
   
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter text to be ciphered");
      String text = sc.next();
      System.out.println("Enter shift value");
      int n = sc.nextInt();
      cipherText(text,n);
   }
}
   //QUESTION 2 (A)

   // Write a program to create linked list of 10 nodes, display all of them and insert a node at given position.

      
   /*  static class Node {
      public int data;
      public Node nextNode;

   
      public Node(int data) {
          this.data = data;

      }
  }

  static Node addNode(int data) {
      return new Node(data);
  }

  
  static Node Insertion(Node headNode, int position, int data) {
      Node head = headNode;
      if (position < 1)
          System.out.print("Invalid position");

      if (position == 1) {
          Node newNode = new Node(data);
          newNode.nextNode = headNode;
          head = newNode;
      } else {
          while (position-- != 0) {
              if (position == 1) {
                  Node newNode = addNode(data);
                  newNode.nextNode = headNode.nextNode;
                  headNode.nextNode = newNode;
                  break;
              }
              headNode = headNode.nextNode;
          }
          if (position != 1)
              System.out.print("Position out of range");
      }
      return head;
  }

  static void display(Node node) {
      while (node != null) {
          System.out.print(node.data);
          node = node.nextNode;
          if (node != null)
              System.out.print(",");
      }
      System.out.println();
  }

  
  public static void main(String[] args) {
      Node head = addNode(3);
      display(head);
      head.nextNode = addNode(5);
      display(head);
      head.nextNode.nextNode = addNode(8);
      display(head);
      head.nextNode.nextNode.nextNode = addNode(10);
      display(head);
      head.nextNode.nextNode.nextNode.nextNode = addNode(13);
      display(head);
      head.nextNode.nextNode.nextNode.nextNode.nextNode = addNode(15);
      display(head);
      head.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = addNode(18);
      display(head);
      head.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = addNode(20);
      display(head);
      head.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = addNode(23);
      display(head);
      head.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = addNode(25);
      System.out.print("Linked list before insertion: ");
      display(head);

      int data = 12, pos = 3;
      head = Insertion(head, pos, data);
      System.out.print("Linked list after" + " insertion of 12 at position 3: ");
      display(head);

      // front of the linked list
      data = 1;
      pos = 1;
      head = Insertion(head, pos, data);
      System.out.print("Linked list after" + "insertion of 1 at position 1: ");
     display(head);

      // insertion at end of the linked list
      data = 15;
      pos = 13;
      head = Insertion(head, pos, data);
      System.out.print("Linked list after" + " insertion of 15 at position 13: ");
      display(head);
  }
*/

//QUESTION 2 (B)
//Write a program to add two polynomial using linked list.
/*
public static Node addPolynomial(Node p1, 
                                     Node p2)
    {
        Node a = p1, b = p2, 
             newHead = new Node(0, 0),
             c = newHead;
  
        while (a != null || b != null) 
        {
            if (a == null) 
            {
                c.next = b;
                break;
            }
            else if (b == null) 
            {
                c.next = a;
                break;
            }
  
            else if (a.pow == b.pow) 
            {
                c.next = new Node(a.coeff + 
                                  b.coeff, a.pow);
                a = a.next;
                b = b.next;
            }
  
            else if (a.pow > b.pow) 
            {
                c.next = new Node(a.coeff, 
                                  a.pow);
                a = a.next;
            }
  
            else if (a.pow < b.pow) 
            {
                c.next = new Node(b.coeff, 
                                  b.pow);
                b = b.next;
            }
            c = c.next;
        }
        return newHead.next;
    }
}
  

class Node 
{
    int coeff;
    int pow;
    Node next;
    Node(int a, int b)
    {
        coeff = a;
        pow = b;
        next = null;
    }
}
  

class LinkedList 
{  
    public static void main(String args[])
    {
        Node start1 = null, cur1 = null, 
             start2 = null, cur2 = null;
        int[] list1_coeff = {5, 4, 2};
        int[] list1_pow = {2, 1, 0};
        int n = list1_coeff.length;
  
        int i = 0;
        while (n-- > 0) 
        {
            int a = list1_coeff[i];
            int b = list1_pow[i];
            Node ptr = new Node(a, b);
            if (start1 == null) 
            {
                start1 = ptr;
                cur1 = ptr;
            }
            else 
            {
                cur1.next = ptr;
                cur1 = ptr;
            }
            i++;
        }
  
        int[] list2_coeff = {-5, -5};
        int[] list2_pow = {1, 0};
        n = list2_coeff.length;
  
        i = 0;
        while (n-- > 0) 
        {
            int a = list2_coeff[i];
            int b = list2_pow[i];
  
            Node ptr = new Node(a, b);
  
            if (start2 == null) 
            {
                start2 = ptr;
                cur2 = ptr;
            }
            else 
            {
                cur2.next = ptr;
                cur2 = ptr;
            }
            i++;
        }
  
        labtask1 obj = new labtask1();
        Node sum = obj.addPolynomial(start1, start2);
        Node trav = sum;
        while (trav != null) 
        {
            System.out.print(trav.coeff + 
                             "x^" + trav.pow);
            if (trav.next != null)
                System.out.print(" + ");
            trav = trav.next;
        }
        System.out.println();
    }
   */
//}
