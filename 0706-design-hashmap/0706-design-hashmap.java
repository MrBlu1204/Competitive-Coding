class MyHashMap {

    private static final int SIZE = 5;
    private ListNode[] buckets;

    private static class ListNode{
        int key, value;
        ListNode next;

        ListNode(int key, int value, ListNode next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public MyHashMap() {
        buckets = new ListNode[SIZE];
        
    }

    private int hash(int key){
        return key%SIZE;
    }
    
    public void put(int key, int value) {
        int bucket = hash(key);
        ListNode curr = buckets[bucket];
        while(curr != null){
            if(curr.key == key){
                curr.value = value;
                return;
            }

            curr = curr.next;
        }

        buckets[bucket] = new ListNode(key, value, buckets[bucket]);

    }
    
    public int get(int key) {
        int bucket = hash(key);

        ListNode curr = buckets[bucket];
        while(curr != null){
            if(curr.key == key){
                return curr.value;
            }
            curr = curr.next;
        }

        return -1;
        
    }
    
    public void remove(int key) {
        int bucket = hash(key);
        if(buckets[bucket] != null && buckets[bucket].key == key){
            buckets[bucket] = buckets[bucket].next;
            return;
        }

        ListNode curr = buckets[bucket];
        while(curr !=  null && curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */