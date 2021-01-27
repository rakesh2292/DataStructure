package linkedList;

public class CreateAndTraverse {
 
	public static void main(String[] args) {

				CreateAndTraverse ct=new CreateAndTraverse();
		Node n=ct.Create();
		ct.Traverse(n);
	}
	public Node Create()
	{
		Node head= new Node(10);
		Node first=new Node(20);
		Node second=new Node(30);
		
		head.next=first;
		first.next=second;
		return head;
	}
	public void Traverse(Node n)
	{
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}

}
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
	
}
