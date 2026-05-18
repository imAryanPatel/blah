public class count_ll {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static void insertNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static Node deleteNode(Node head, int key) {
        if (head == null)
            return null;

        if (head.data == key)
            return head.next;

        Node prev = null;
        Node curr = head;

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null)
            return head;

        prev.next = curr.next;
        return head;
    }

    static void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int count(Node head, int key) {
        if (head == null)
            return 0;

        int ans = count(head.next, key);
        if (head.data == key)
            ans++;

        return ans;
    }

    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Detect cycle start
    static Node detectCycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        if (fast == null || fast.next == null)
            return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        insertNode(1);
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);
        insertNode(6);

        System.out.print("Original List: ");
        traverse();

        head = deleteNode(head, 4);

        System.out.print("After Deleting 4: ");
        traverse();

        System.out.println("Count of 3: " + count(head, 3));

        Node mid = findMiddle(head);
        System.out.println("Middle element: " + mid.data);
    }
}
