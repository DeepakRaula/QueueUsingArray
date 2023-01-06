package queue;

public class QueueUsingArray {

	
	private int data[];
	private int frontIdx;
	private int rearIdx;
	
	private int size;
	
	public QueueUsingArray() {
		data = new int[5];
		frontIdx = -1;
		rearIdx = -1;
		
	}
	
	
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		frontIdx = -1;
		rearIdx = -1;
		
	}
	
	
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(int ele) throws QueueFullException {
		
		if(size == data.length) {
			throw new QueueFullException();
		}
		
		if(size == 0) {
			frontIdx++;
		}
			rearIdx++;
			data[rearIdx] = ele;
			size++;
		}
		

	
	public int front() throws QueueEmptyException   {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		return data[frontIdx];
	}
	
	public int dequeue() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		int temp = data[frontIdx];
		frontIdx++;
		size--;
		if(size == 0) {
			frontIdx = -1;
			rearIdx = -1;
		}
		return temp;
		
	}
	
	public int size() {
		return size;
	}


}
