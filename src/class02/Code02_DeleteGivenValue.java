package class02;

public class Code02_DeleteGivenValue {

	public static class Node {
		public int value;
		public Node next;

		public Node(int data) {
			this.value = data;
		}
	}

	//C++存在内存泄漏的问题；需要自己手动调用析构函数，手动释放内存
	//java不存在内存泄漏的问题,因为没有引用指向删除节点，jvm自动回收；但是双向链表，jvm不会自动回收（需要将pre指向null）
	public static Node removeValue(Node head, int num) {
		//先找到链表中不需要删除的位置
		while (head != null) {
			if (head.value != num) {
				break;
			}
			head = head.next;
		}
		// head来到 第一个不需要删的位置
		Node pre = head;
		Node cur = head;
		// 
		while (cur != null) {
			if (cur.value == num) {
				pre.next = cur.next;
			} else {
				pre = cur;
			}
			cur = cur.next;
		}
		return head;
	}

}
