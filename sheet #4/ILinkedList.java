package eg.edu.alexu.csd.datastructure.linkedList;

public class ILinkedList implements LinkedList {
	public class Node {
		public Object value;
		public Node next;

		
		public Node (Object x){
			value = x;
		}
		public Node (){
			
		}
		public Object getValue() {
			return value;
		}
		
		
		
	}
	  public Node head;
	  
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
	        for(int count = 0 ; count < index-1 ; count++) {
	            temp = temp.next;
	        }
	        Node newNode = new Node(element);
	        newNode.next = temp.next;
	        temp.next = newNode;
	        size++;
	    }
	       
	    }
	   
	   
	    public void add(Object element) {
	        if(size == 0) {
	            Node newNode = new Node(element);
	            newNode.next = null;
	            head = newNode;
	        }
	        Node temp = head;
	        for(int count = 0 ; count < size ; count++) {
	            temp = temp.next;
	        }
	        Node newNode = new Node(element);
	        temp.next = newNode;
	        newNode.next = null;  
	        size++;
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
	            return temp.value;     
	        }  
	    }
	   
	    public void set(int index, Object element) {
	        if(index < 0 || index > size-1) {System.out.println("Error");}
	        else {
	            Node temp = head;
	            for(int count = 0 ; count < index ; count++) {
	                temp = temp.next;
	            }
	            temp.value = element;  
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
	        if(index < 0 || index > size-1 || size == 0) {System.out.println("Error");}
	        else {
	            if(index == 0) {
	                head = head.next;
	                size--;
	            }
	            else {
	                Node temp = head;
	                for(int count = 0 ; count < index-1 ; count++) {
	                    temp = temp.next;
	                }
	                temp.next = temp.next.next;
	                size--;
	               
	            }
	        }
	    }
	   
	    public int size() {return size;}
	   
	   
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
	                Node newNode = new Node(temp.value);
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
	   
	   
	    public boolean contains(Object o){
	        Node temp = head;
	        for(int count = 0 ; count < size ; count++){
	        if(temp.value == o) {
	            return true;
	        }
	        }
	       
	        return false;
	    }
	   
	   
	   
}
