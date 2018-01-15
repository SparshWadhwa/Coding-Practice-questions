import java.util.LinkedList;

public class middleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node root=new Node(10);
Node n1= new Node(20);
Node n2= new Node(30);
Node n3 = new Node(40);
Node n4=new Node(50);
Node n5= new Node(60);
Node n6= new Node(70);
Node n7=new Node(80);
root.next=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
n5.next=n6;
n6.next=n7;
n7.next=null;
int j=0,data=root.data;
double i=0;
Node head=new Node(root.data);
head=root;
while(root!=null) {
	j=j+1;
	i=i+0.5;
	data=root.data;
	root=root.next;
}
int midData=head.data;
int a=0;
for( a=0;a<i;a++) {
	midData=head.data;
	head=head.next;
}
System.out.println("the length of linked list is "+j+" with value "+data);
System.out.println("the middle of linked list is "+a+ " with value "+midData);

	}

	

}
class Node{
	int data;
	Node next;
	Node(){
	}
	Node(int d){
		data =d;
		next=null;
	}
	Node(int d,Node next){
		data =d;
		this.next=next;
	}
}
