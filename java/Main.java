class Main{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static void removeDuplicates(Node head){
        Node previous=head;
        Node current=head.next;
        while(current!=null){
            if(current.val==previous.val){
                previous.next=previous.next.next;
                current=current.next;
            }else{
                previous=previous.next;
                current=current.next;
            }
        }
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
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
    display(a);
    // removeDuplicates(a);
    // display(a);
    a=reverse1(a);
    display(a);
    a=reverse2(a);
    display(a);
    
}
}