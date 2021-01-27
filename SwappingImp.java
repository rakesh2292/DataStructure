package linkedList;

public class SwappingImp {

	public void swap(int x,int y,Node head)
	{
		Node nodex=null,nodey=null;
		Node n=head;
		while(n.next!=null)
		{
		if(n.next.data==x)
			nodex=n;
		if(n.next.data==y)
			nodey=n;
		n=n.next;
		}
		System.out.println("nodex: "+nodex.data+"nodey: "+nodey.data);
		 Node n1=nodex.next;
		 nodex.next=nodey.next;
		 nodey.next=n1;
		 n1=nodex.next.next;
		 nodex.next.next=nodey.next.next;
		 nodey.next.next=n1;
	}
	
}
