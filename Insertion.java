package linkedList;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateAndTraverse ct=new CreateAndTraverse();
		Insertion insert=new Insertion();
		Node head=ct.Create();
		Node node=new Node(5);
		head=insert.InsertAtFront(node, head);
		System.out.println("Inserted at front");
		ct.Traverse(head);
		Node last=new Node(40);
		head=insert.InsertAtEnd(last, head);
		System.out.println("Inserted at End");
		ct.Traverse(head);
	//Insertion after a certain node
		Node node2=new Node(7);
		insert.InsertAfter(node2, head);
		System.out.println("Insertion after a certain node");
		ct.Traverse(head);
		
	//Length 
		FindLength fl=new FindLength();
		System.out.println("Length of List: "+fl.Iterative(head));
		System.out.println("Length of list calling recurcive function: "+fl.Recursive(head));
		
	//Swapping
		SwappingImp swap=new SwappingImp();
		swap.swap(30,40, head);
		ct.Traverse(head);
	}
	public Node InsertAtFront(Node n,Node head)
	{
		n.next=head;
		return n;
	}
	public Node InsertAtEnd(Node n,Node head)
	{	Node node=head;
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=n;
		return head;
	}
	public void InsertAfter(Node n,Node prev_node)
	{
		n.next=prev_node.next;
		prev_node.next=n;
	}

}
