class Reverse{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    // iterative - TC = O(n), SC = O(1)
    static Node reverse1(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node previous = null;
        Node current=head;
        Node next_ = head.next;
        while(true){
            current.next=previous;
            if(next_==null){
                head=current;
                return head;
            }
            previous=current;
            current=next_;
            next_=next_.next;
        }
    }
    // recursion - TC = O(n), SC = O(n)
    static Node reverse2(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverse2(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    // palindrome linked list
    static boolean palindrome1(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next==null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2 = reverse1(slow.next);
        Node x = head;
        Node y = head2;
        while(y!=null){
            if(x.val!=y.val){
                return false;
            }
            x=x.next;
            y=y.next;
        }
        return true;
    }
    static boolean palindrome2(Node head){
        Node temp=head;
        Node head2=new Node(100);
        Node temp2=head2;
        while(){
            
        }
    }
    public static void main(String[] args){
        Node a=new Node(10);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(5);
    Node f=new Node(6);
    Node g=new Node(7);
    Node h=new Node(8);
    Node i=new Node(9);
    Node j=new Node(10);
    Node k=new Node(11);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=f;
    f.next=g;
    g.next=h;
    h.next=i;
    i.next=j;
    j.next=k;
    k.next=null;
    
    }
}