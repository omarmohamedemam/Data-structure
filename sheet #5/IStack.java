
package eg.edu.alexu.csd.datastructure.stack;

public interface IStack {
	public Object pop();
	public Object peek();
	public void push(Object element);
	public boolean isEmpty();
	public int size();
}
