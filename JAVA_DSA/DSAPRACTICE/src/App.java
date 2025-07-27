import java.util.Stack;  
import java.io.*;  
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class App {
  // 05-01-23 Linked lists
// Case 1 : INSERTION OF A NODE AT THE START
/* 
     //Represent a node of the singly linked list  
     class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addAtStart() will add a new node to the beginning of the list  
    public void addAtStart(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //Node temp will point to head  
            Node temp = head;  
            //newNode will become new head of the list  
            head = newNode;  
            //Node temp(previous head) will be added after new head  
            head.next = temp;  
        }  
    }  
  
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        App sList = new App();  
  sList.display();
        //Adding 1 to the list  
        sList.addAtStart(1);  
        sList.display();  
  
        //Adding 2 to the list  
        sList.addAtStart(2);  
        sList.display();  
         //Adding 3 to the list  
         sList.addAtStart(3);  
         sList.display();  
   
         //Adding 4 to the list  
         sList.addAtStart(4);  
         sList.display();  
     } 



     // CASE 2: INSERTION OF A NODE AT THE END

     class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addAtStart() will add a new node to the beginning of the list  
    public void addAtStart(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
              //newNode will be added after tail such that tail's next will point to newNode  
              tail.next = newNode;  
              //newNode will become new tail of the list  
              tail = newNode;  
        }  
    }  
  
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        App sList = new App();  
  sList.display();
        //Adding 1 to the list  
        sList.addAtStart(1);  
        sList.display();  
  
        //Adding 2 to the list  
        sList.addAtStart(2);  
        sList.display();  
         //Adding 3 to the list  
         sList.addAtStart(3);  
         sList.display();  
   
         //Adding 4 to the list  
         sList.addAtStart(4);  
         sList.display();  
     } 
 */

     // CASE 3: INSERTING A NODE AT A GIVEN LOCATION

     //120123 stacks dsa lab

     // Exercise 1 : Basic operations of stacks
  /* 
     public static void main(String[] args)   
{  
    int top=-1;
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  



// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  

int topno = stk.peek();
System.out.println("The element at the top is " + topno);  
if( top == stk.size()-1)
{
    System.out.println("the stack is full");  
}
else{
    stk.push(45);
    System.out.println("Elements in Stack: " + stk);  
}

}  
 */
// Exercise 2 : Reversal of string

/* public static String ReverseString(String str)
    {
        char[] reverseString = new char[str.length()];
        // Declare a stack of type Character
        Stack<Character> stack = new Stack<Character>();
  
        // Traverse the String and push the character one by
        // one into the Stack
        for (int i = 0; i < str.length(); i++) {
            // push the character into the Stack
            stack.push(str.charAt(i));
        }
  
        // Now Pop the Characters from the stack until it
        // becomes empty
  
        int i = 0;
        while (!stack.isEmpty()) { // popping element until
                                   // stack become empty
            // get the character from the top of the stack
            reverseString[i++] = stack.pop();
        }
        // return string object
        return new String(reverseString);
    }
  
    // Driver code
    public static void main(String[] args)
    {
        String str1 = "TAJ MAHAL";
        
        // call the function
        System.out.println(str1 + " <- Reverse -> "
                           + ReverseString(str1));
        
        String str2 = "Hello future";
        
        // call the function
        System.out.println(str2 + " <- Reverse -> "
                           + ReverseString(str2));
    }
 */
    // EXERCISE 3 : infix to prefix
    /* public static int priority(char x)
    {
        if(x == '(')
return 0;
if(x == '+' || x == '-')
return 1;
if(x == '*' || x == '/')
return 2;
return 0;
    } 
    static Stack operators = new Stack();      
    public static void main(String[] args) throws IOException
    {
        char exp[] = new char[100];
        BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));  
        System.out.println("enter expression");
        String infix = keyboard.readLine();  
        System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));  



    } 
    private static String toPostfix(String infix)  
//converts an infix expression to postfix  
{  
char symbol;  
String postfix = "";  
for(int i=0;i<infix.length();++i)  
//while there is input to be read  
{  
symbol = infix.charAt(i);  
//if it's an operand, add it to the string  
if (Character.isLetter(symbol))  
postfix = postfix + symbol;  
else if (symbol=='(')  
//push (  
{  
operators.push(symbol);  
}  
else if (symbol==')')  
//push everything back to (  
{  
while (operators.peek() != '(')  
{  
postfix = postfix + operators.pop();  
}  
operators.pop();        //remove '('  
}  
else  
//print operators occurring before it that have greater precedence  
{  
while (!operators.isEmpty() && !(operators.peek() =='(') && prec(symbol) <= prec(operators.peek()))  
postfix = postfix + operators.pop();  
operators.push(symbol);  
}  
}  
while (!operators.isEmpty())  
postfix = postfix + operators.pop();  
return postfix;  
}  
static int prec(char x)  
{  
if (x == '+' || x == '-')  
return 1;  
if (x == '*' || x == '/' || x == '%')  
return 2;  
return 0; 
}   */
public static void cipherText(String c, int b){
    char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    String temp="";
 int x=0;
    int len = c.length();
    String a = c.toUpperCase();
    for(int i = 0; i<len;i++)
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
