 public class LinkedListNode{
	int value;
	 LinkedListNode next;
	public int getValue() {
		return value;
	}
	public LinkedListNode getNext() {
		return next;
	}
	//constructors
	public LinkedListNode (int b) {
		value = b;
	}
	public LinkedListNode () {
	}
	// an added function to add elements at tail
	public void addAtTail(int dat,LinkedListNode head)
	{
		LinkedListNode temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = new LinkedListNode(dat);
	}
}
  