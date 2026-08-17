class MinStack {
    class Node {
        int min;
        int val;
        Node next;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    Node head;

    public MinStack() {
        head = null;
    }

    public void push(int value) {
        if (head == null) {
            head = new Node(value, value);
        } else {
            Node curr = new Node(value, Math.min(value, head.min));
            curr.next = head;
            head = curr;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */