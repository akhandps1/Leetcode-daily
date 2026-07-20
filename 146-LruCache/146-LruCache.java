// Last updated: 7/21/2026, 12:53:09 AM
class LRUCache {
    class Node{
        int key;
        int val;
        Node prev,next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    HashMap<Integer,Node>map=new HashMap<>();
    int capacity;

    public LRUCache(int _capacity) {
        capacity=_capacity;
        head.next=tail;
        tail.prev=head;

        
    }
    private void addNode(Node node){
        Node headNext=head.next;
        node.next=headNext;
        node.prev=head;
        head.next=node;
        headNext.prev=node;
    }
    private void removeNode(Node node){
        Node prevNode=node.prev;
        Node nextNode=node.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            removeNode(node);
            addNode(node);
            return node.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            removeNode(node);
            addNode(node);
        }else{
            if(map.size()==capacity){
                Node lru=tail.prev;
                map.remove(lru.key);
                removeNode(lru);
            }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            addNode(newNode);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */