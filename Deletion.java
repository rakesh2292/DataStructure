package linkedList;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateAndTraverse ct=new CreateAndTraverse();
		Node head=ct.Create();
		Deletion del=new Deletion();
		del.Delete_Key(20, head);
		ct.Traverse(head);
	}
	public Node Delete_Key(int key, Node head)
	{
		Node n=head;
		while(n!=null)
		{
			if(n.next.data==key)
			{
				n.next=n.next.next;
				break;
			}
			n=n.next;
		}
		return head;
	}

}
