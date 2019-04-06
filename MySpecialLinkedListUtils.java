
public class MySpecialLinkedListUtils {
	

	public  double[] summary(LinkedListNode head) {
		LinkedListNode temp = head;
		int sum=0;
		int num=0;
		int min=head.value;
		int max=head.value;
		while(head!=null) {
			sum=sum + head.value;
			num++;
			if(min>head.value) {
				min=head.value;
			}
			if(max<head.value) {
				max=head.value;
			}
			head=head.next;	
		}
		double avg = sum/num;
		LinkedListNode p1 = temp;
		LinkedListNode p2 = temp;
		while ( p2.next != null ) {
		    p2 = p2.next;
		    if (p2.next != null) {
		        p2 = p2.next;
		        p1 = p1.next;
		    }
		}
		int median = p1.value;
		double[] ans=new double[5];
		ans[0]=sum;
		ans[1]=avg;
		ans[2]=median;
		ans[3]=max;
		ans[4]=min;
		return ans;
	}
	public  LinkedListNode reverse(LinkedListNode head) {
		LinkedListNode prev = null; 
		LinkedListNode current = head; 
		LinkedListNode next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        head = prev; 
	        return head; 
	    }
	public static LinkedListNode evenIndexedElements (LinkedListNode head) {
		int num =1;
		
		LinkedListNode head2= new LinkedListNode(head.value) ;
		head = head .next;
		while(head != null) {
			if(num%2==0) {
				head2.addAtTail(head.value, head2);
			}
			num++;
			head = head .next;
		}
		return head2;
		
	}
	//this function prints the list (only for checking)
	void printList( LinkedListNode node) { 
        while (node != null) { 
            System.out.print(node.value + " "); 
            node = node.next; 
        } 
    }
	public static LinkedListNode insertionSort(LinkedListNode head) {
		LinkedListNode current = head;
		   LinkedListNode tail = null;
		   while(current != null&& tail != head )
		   {
		      LinkedListNode next = current;
		      for( ; next.next != tail;  next = next.next)
		      {
		        if(next.value >= next.next.value)
		        {
		          int temp = next.value;
		          next.value = next.next.value;
		          next.next.value = temp;
		        }
		      }
		      tail = next;
		      current = head;
		   }
		   return current;
	}
	// this is an addition function to help in merge sort (it merges two sorted lists)
	public static LinkedListNode sortedMerge(LinkedListNode a, LinkedListNode b)  
    { 
        LinkedListNode result = null; 
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
        if (a.value <= b.value)  
        { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        }  
        else 
        { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
  
    } 
	// the original function of merge sort
	public static LinkedListNode mergeSort(LinkedListNode head) { 
	        if (head == null || head.next == null) 
	        { 
	            return head; 
	        }
	        LinkedListNode p1 = head;
			LinkedListNode p2 = head;
			while ( p2.next != null ) {
			    p2 = p2.next;
			    if (p2.next != null) {
			        p2 = p2.next;
			        p1 = p1.next;
			    }
			} 
	        LinkedListNode middle = p1; 
	        LinkedListNode nextofmiddle = middle.next; 
	        middle.next = null;  
	        LinkedListNode left = mergeSort(head); 
	        LinkedListNode right = mergeSort(nextofmiddle); 
	        LinkedListNode sortedlist = sortedMerge(left, right); 
	        return sortedlist; 
	    } 
	public static void  removeCentralNode(LinkedListNode head) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		while ( p2.next != null ) {
		    p2 = p2.next;
		    if (p2.next != null) {
		        p2 = p2.next;
		        if(p2.next != null  ) {
		        	p1 = p1.next;
		    }
		}
		}
        
        p1.next=p1.next.next;
	
	}
	public static boolean palindrome(LinkedListNode head) {
		 if(head == null)
		        return true;
		 
		    LinkedListNode p = head;
		    LinkedListNode prev = new LinkedListNode(head.value);
		 
		    while(p.next != null){
		        LinkedListNode temp = new LinkedListNode(p.next.value);
		        temp.next = prev;
		        prev = temp;
		        p = p.next;
		    }
		 
		    LinkedListNode p1 = head;
		    LinkedListNode p2 = prev;
		 
		    while(p1!=null){
		        if(p1.value != p2.value)
		            return false;
		 
		        p1 = p1.next;
		        p2 = p2.next;
		    }
		 
		    return true;
	}
}



