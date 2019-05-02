package eg.edu.alexu.csd.datastructure.queue;

public class IArrayBased implements IQueue {
	 private Object[] arr;
	    private int N;
	    private int f = -1;
	    private int r = -1;
	   
	    public IArrayBased (int Num){
	        N = Num;
	        arr = new Object[N];
	    }
	   
	    public void enqueue(Object item) {
	        if(f == (r+1) % N){
	            throw new IllegalStateException("FullQueue");
	        }
	        else if(isEmpty()) {
	            r = 0;
	            f = 0;
	            arr[r] = item;
	        }
	        else {
	        r = (r+1) % N;
	        arr[r] = item;
	    }
	    }
	 
	    public Object dequeue() {
	        if(isEmpty()) {
	            throw new IllegalStateException("EmptyQueue");
	        }
	        else {
	            Object temp = arr[f];
	            if(f == r) {
	                f = -1;
	                r = -1;
	            }
	            else{
	                f = (f+1) % N;
	            }
	            return temp;
	        }
	    }
	   
	    public boolean isEmpty() {
	        if(f==-1 && r == -1) {
	            return true;
	        }
	        return false;
	    }
	   
	    public int size() {
	    	if(f>r){
				return N-f+r+1; 
			}
			else if(f<r || (f == 0)&&(r==0)){
				return r-f+1;
			}
			else{
				return 0;
			}
}
}
