class Main{
    public static void main(String[] args){
        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(100);
        Node temp=head;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            temp.next=temp1;
        }else{
            temp.next=temp2;
        }
        head=head.next;
        return head;
    }
}