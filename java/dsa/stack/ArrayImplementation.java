public class ArrayImplementation{
    static class createStack{
        int n;
        int[] arr;
        int i=-1;
        void push(int val){
            if(i==(n-1)){
                System.out.print("Stack is Full");
                return;
            }
            arr[++i]=val;
        }
        int pop(){
            if(i==-1){
                System.out.print("Stack is Empty");
                return -1;
            }
            return arr[i--];
        }
        int peek(){
            if(i==-1){
                System.out.print("Stack is Empty");
                return -1;
            }
            return arr[i];
        }
        int size(){
            return i+1;
        }
        boolean isEmpty(){
            return i==-1;
        }
        boolean isFull(){
            return i==(n-1);
        }
        int capacity(){
            return n;
        }
        createStack(int n){
            this.n=n;
            this.arr=new int[n];
        }
    }
    public static void main(String[] args){
        createStack st = new createStack(50);
        System.out.println(st.size());
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.size());
    }
}