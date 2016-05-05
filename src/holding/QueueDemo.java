package holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// Upcasting to a Queue from a LinkedList
public class QueueDemo {
	public static void printQ(Queue queue){
		// peek() ��queueΪ��ʱ����null, element() ���׳� NoSuchElementException
		while(queue.peek() != null)  // �˴������⣬���queue�б������null��������жϽ���
			System.out.print(queue.remove() + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++){ 
//			if(i == 4)
//				queue.offer(null);
			queue.offer(rand.nextInt(i + 10));
		}
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c: "Brontosaurus".toCharArray()) 
			qc.offer(c);
		printQ(qc);
	
	}
	
}
