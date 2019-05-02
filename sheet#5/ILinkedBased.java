package eg.edu.alexu.csd.datastructure.queue;

public class ILinkedBased implements IQueue {
	class QNode 
	{ 
	    Object key; 
	    QNode next; 
	    public QNode(Object key) { 
	        this.key = key; 
	        this.next = null; 
	    } 
	}
	QNode front, rear; 
    
     public ILinkedBased() {
    	  this.front = this.rear = null;
	} 
      
	public void enqueue(Object item) {
		QNode temp = new QNode(item); 
	       
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) 
        { 
           this.front = this.rear = temp; 
           return; 
        } 
       
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
	}
	public Object dequeue() {
		// If queue is empty, return NULL. 
        if (this.front == null) 
        	throw new IllegalStateException("EmptyQueue");
          // return null; 
       
        // Store previous front and move front one node ahead 
        QNode temp = this.front; 
        this.front = this.front.next; 
       
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
           this.rear = null; 
        return temp.key; 
	}
	public boolean isEmpty() {
		if(front==null) {
			return true;
		}
		else { return false;}
	}
	public int size() {
		 QNode temp= front;
		 int size=0;
		while(temp!=null) {
			size++;
			temp=temp.next;	
		}
		return size;
	}
}