package class04;

import java.util.Comparator;
import java.util.PriorityQueue;

//系统实现的堆
public class Test {

	//  负数，o1 放在上面的情况
	public static class MyComp implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("hello");
		// PriorityQueue默认为：小根堆
		//现在是大根堆
		PriorityQueue<Integer> heap = new PriorityQueue<>(new MyComp());
		
		heap.add(5);
		heap.add(7);
		heap.add(3);
		heap.add(0);
		heap.add(2);
		heap.add(5);
		
		while(!heap.isEmpty()) {
			System.out.println(heap.poll());
		}
		
		
		
		
		
	}
	
}
