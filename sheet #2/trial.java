
public class trial {
	public static void main(String[] args) {
		MySpecialLinkedListUtils trr = new MySpecialLinkedListUtils();
		LinkedListNode head =new LinkedListNode(1);
		head.next = new LinkedListNode(9);
		head.next.next = new LinkedListNode(9);
		head.next.next.next = new LinkedListNode(1);
		head.next.next.next.next = new LinkedListNode(0);
		System.out.println("The linked list:");
		trr.printList(head);
		System.out.println();
		System.out.println("The reversed linked list");
		head = trr.reverse(head);
		trr.printList(head);
		System.out.println();
		double[] m =new double[5];
		m = trr.summary(head);
		System.out.println("sum of the list = "+ m[0]);
		System.out.println("Avg of the list = "+ m[1]);
		System.out.println("Median of the list = "+ m[2]);
		System.out.println("Max of the list = "+ m[3]);
		System.out.println("Min of the list = "+ m[4]);
		System.out.println("the even indexed elemnts:");
		LinkedListNode h= trr.evenIndexedElements(head);
		trr.printList(h);
		System.out.println();
		System.out.println("is the list palindrome:");
		boolean pal = trr.palindrome(head);
		System.out.println(pal);
		System.out.println("list after insertion sort : ");
		LinkedListNode f = trr.insertionSort(head);
		trr.printList(f);
		System.out.println();
		LinkedListNode z = trr.mergeSort(head);
		System.out.println("list after merge sort : ");
		trr.printList(z);
		System.out.println();
		trr.removeCentralNode(head);
		System.out.println("sorted list after removing the central element : ");;
		trr.printList(head);
		
		
		
	}
	
	
}
