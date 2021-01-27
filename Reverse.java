package linkedList;

public class Reverse {
	
	public void reverse(Node head)
	{
		Node n=head.next;
		head.next=null;
		while(head!=null)
		{
			n=head.next;
			n.next=head;
			head=head.next;
		}
	}
}
