/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        HashMap<Node, Node> old2New = new HashMap<>();

        Node currNode = head;

        while(currNode != null){
            Node newCopy = new Node(currNode.val);
            old2New.put(currNode, newCopy);
            currNode = currNode.next;
        }

        Node oldNode = head;
        Node newNode;

        while(oldNode!=null){
            newNode = old2New.getOrDefault(oldNode, null);
            newNode.next = old2New.getOrDefault(oldNode.next, null);
            newNode.random = old2New.getOrDefault(oldNode.random, null);
            oldNode = oldNode.next;
        }

        Node newHead = old2New.getOrDefault(head, null);

        return newHead;
        
    }
}