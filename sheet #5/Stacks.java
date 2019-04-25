package eg.edu.alexu.csd.datastructure.stack;

public class Stacks implements IStack {
	static final int MAX = 10000; 
    Object top; 
    Object a[] = new Object[MAX]; 
    int Size =0;
    public Object pop() {
    	if (Size <= 0) 
        { 
            System.out.println("Stack Underflow"); 
            return 0 ;
        } 
        else
        { 
            Object x = a[Size-1]; 
            Size--;
            return x; 
        } 
    }
    public Object peek() {
    	if (Size < 0) 
        { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else
        { 
            Object x = a[Size-1]; 
            return x; 
        } 
    }
    public void push(Object element) {
    	 if (Size >= (MAX-1)) 
         { 
             System.out.println("Stack Overflow"); 
         } 
         else
         { 
             a[Size] = element; 
             System.out.println(element + " pushed into stack"); 
             Size++;
         } 
    }
    public boolean isEmpty() {
    	if(Size == 0 ) {return true;}
    	else {return false;}
    }
    public int size() {
    	return Size;
    }
    
}
