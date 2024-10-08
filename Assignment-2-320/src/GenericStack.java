public class GenericStack<E> {
	private E[] list;
	private int tail = 0;
	private int length;
	
	GenericStack(){
		allocate(5);
	}
	
	GenericStack(int size){
		allocate(size);
	}
	
	@SuppressWarnings("unchecked")
	private void allocate(int size) {
		length = size;
		list = (E[]) new Object[length];
	}
	
	public int getSize() {
		return tail;
	}
	
	//this method is added to debug the system and check the length at any time
	public int getLength() {
		return length;
	}
	
	public E peek() throws Exception{
		if (isEmpty()) {
			throw new Exception("The array is empty\n");
		}
		return list[getSize() - 1];
	}
	
	@SuppressWarnings("unchecked")
	public void push(E o) {
		if (tail >= length) {
			E newList[] = (E[])new Object[length *= 2];
			System.arraycopy(list, 0, newList, 0, list.length);
			list = newList;
		}
		list[tail++] = o;
	}
	
	public E pop() throws Exception{
		E o = peek();
		tail--;
		return o;
	}
	
	public boolean isEmpty() { 
		return (tail == 0);
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}