package eg.edu.alexu.csd.datastructure.linkedList;

public class DLinkedList implements LinkedList {
	class Node { 
        Object data; 
        Node prev; 
        Node next;  
        Node(Object d) { data = d; } 
    } 
	private Node head;
	//private Node Tail;
    private int size;
	public void add(int index, Object element) {
		 if(index < 0 || index > size-1) {System.out.println("Error!");}
		 else if(index == 0) {
	            Node newNode = new Node(element);
	            newNode.next = head;
	            head = newNode;
	            size++;
	        }
	        else {
	        Node temp = head;
	        for(int count = 0 ; count < index ; count++) {
	            temp = temp.next;
	        }
	        Node newNode = new Node(element);
	        newNode.next = temp.next;
	        temp.next = newNode;
	        newNode.prev=temp;
	        if(newNode.next != null) {
	        	newNode.next.prev=newNode;
	        }
	        size++;
	    }
	}
	public void add(Object element) {
		 Node new_node = new Node(element); 
		    Node last = head; /* used in step 5*/
		    new_node.next = null; 
		    if (head == null) { 
		        new_node.prev = null; 
		        head = new_node; 
		        return; 
		    } 
		    while (last.next != null) 
		        last = last.next; 
		    last.next = new_node; 
		    new_node.prev = last; 
	}
	public Object get(int index) {
		 if(index < 0 || index > size-1) {
	            System.out.println("Error");
	            return false;
	        }
	        else{
	            Node temp = head;
	            for(int count = 0 ; count < index ; count++) {
	                temp = temp.next;
	            }
	            return temp.data;     
	        }  
	}
	public void set(int index, Object element) {
		if(index < 0 || index > size-1) {System.out.println("Error");}
        else {
            Node temp = head;
            for(int count = 0 ; count < index ; count++) {
                temp = temp.next;
            }
            temp.data = element;  
        }
	}
	public void clear() {
		head = null;
        size = 0;
	}
	public boolean isEmpty() {
		if(size == 0) return true;
	       
        return false;
	}
	public void remove(int index) {
		Node temp = head;
        for(int count = 0 ; count < index ; count++) {
            temp = temp.next;
        }
        if (head == null || temp == null) { 
            return; 
        } 
        if (head == temp) { 
            head = temp.next; 
        } 
        if (temp.next != null) { 
           temp.next.prev = temp.prev; 
        } 
        if (temp.prev != null) { 
            temp.prev.next = temp.next; 
        } 
        return; 
	}
	public int size() {
		return size;
	}
	public ILinkedList sublist(int fromIndex, int toIndex) {
		 if(fromIndex < 0 || toIndex > size-1) {return null;}
	        else {
	            Node temp = this.head;
	            for(int count = 0 ; count < fromIndex ; count++) {
	                temp = temp.next;
	            }
	            ILinkedList New = new ILinkedList();
	            Node Temp = head;
	            while(temp != null){
	                Node newNode = new Node(temp.data);
	                if(size == 0) {
	                    newNode.next = null;
	                    head = newNode;}
	                else {
	                    newNode.next = null;
	                    head.next = newNode;               
	                }
	                temp = temp.next;
	                Temp = Temp.next;
	                size++;
	            }
	            return New;
	        }
	}
	public boolean contains(Object o) {
		 Node temp = head;
	        for(int count = 0 ; count < size ; count++){
	        if(temp.data == o) {
	            return true;
	        }
	        }
	       
	        return false;
	}
}
