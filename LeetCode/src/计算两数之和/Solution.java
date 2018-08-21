package 计算两数之和;

public class Solution {
	public static void main(String[] args) {
		
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder1 = new StringBuilder();
		while (l1 != null) {
			stringBuilder.append(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			stringBuilder1.append(l2.val);
			l2 = l2.next;
		}
		stringBuilder = stringBuilder.reverse();
		stringBuilder1 = stringBuilder1.reverse();
		long sum = Long.parseLong(stringBuilder.toString()) + Long.parseLong(stringBuilder1.toString());
		ListNode listNode = new ListNode(Math.toIntExact(sum%10));
		ListNode listNode2 = listNode;
		sum = sum/10;
		while (sum > 0) {
			listNode.next = new ListNode(Math.toIntExact(sum%10));
			listNode = listNode.next;
			sum /= 10;
		}
		return listNode2;
	}
}

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
