package linkedList;

public class FindLength {

	public int Iterative(Node head)
	{
		int length=0;
		Node n=head;
		while(n!=null)
		{
			length++;
			n=n.next;
		}
		return length;
	}
	public int Recursive(Node head)
	{
		if(head==null)
			return 0;
		return 1+Recursive(head.next);
	}
}
