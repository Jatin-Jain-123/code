import java.util.Stack;
public class Basics{
    /*
    Note - 
    1. most questions have many approaches
    2. in questions involving creation of temporary stack, a temporary array can also be used

    */ 

    // implement print stack
    static void printStack1(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int x = st.pop();
        printStack1(st);
        System.out.print(x+" ");
        st.push(x);
    }
    static void printStack2(Stack<Integer> st){
        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        }
    
    static void printStack3(Stack<Integer> st){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
        rt.push(st.pop());
        }
        while(rt.size()>0){
        int x = rt.peek();
        System.out.print(x+" ");
        st.push(rt.pop());
        }
    }

    // print reverse stack
    static void printReverse(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int x = st.pop();
        System.out.print(x+" ");
        printReverse(st);
        st.push(x);
    }
    // make a stack empty
    static void empty(Stack<Integer> st){
        while(st.size()>0){
            st.pop();
        }
    }
    // copy contents
    static void copyStack(Stack<Integer> st1,Stack<Integer> st2){
        if(st1.size()==0){
            return;
        }
        int x = st1.peek();
        st1.pop();
        copyStack(st1,st2);
        st2.push(x);
        st1.push(x);

        /* alternative
        Stack<Integer> temp = new Stack<>();
        while(st1.size()>0){
            int x = st1.peek();
            temp.push(x);
            st1.pop();
        }
        while(temp.size()>0){
        int x = temp.peek();
        st2.push(x);
        temp.pop();
        }
        */


    }
    // reverse copy
    static void reverseCopyStack(Stack<Integer> st1,Stack<Integer> st2){
        if(st1.size()==0){
            return;
        }
        int x = st1.peek();
        st1.pop();
        st2.push(x);
        reverseCopyStack(st1,st2);
        st1.push(x);

        /* 
        alternative

        while(st1.size()>0){
        int x = st1.peek();
        st2.push(x);
        st1.pop();
        } 
        
        */
    }

    // reverse a stack
    static void reverse1(Stack<Integer> st){
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        while(st.size()>0){
        int x = st.peek();
        temp1.push(x);
        st.pop();
        }
        while(temp1.size()>0){
        int x = temp1.peek();
        temp2.push(x);
        temp1.pop();
        }
        while(temp2.size()>0){
            int x = temp2.peek();
            st.push(x);
            temp2.pop();
        }
    }
    static void reverse2(Stack<Integer> st){
        if(st.size()==1)
        {
            return;
        }
        int x = st.pop();
        reverse2(st);
        insertAtBottom(st,x);
    }
    // insert at bottom
    static void insertAtBottom(Stack<Integer> st, int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int temp = st.pop();
        insertAtBottom(st,val);
        st.push(temp);

        /* alternative 
        
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
        int x = st.pop();
        temp.push(x);
        }
        st.push(val);
        while(temp.size()>0){
        int x = temp.pop();
        st.push(x);
        }

        */
    }

    // insert at an index
     static void insertAtIndex(Stack<Integer> st, int idx, int val){
        if(st.size()<=idx){
            st.push(val);
            return;
        }
        int x = st.pop();
        insertAtIndex(st,idx,val);
        st.push(x);
        /* 
        alternative

        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
        temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
        st.push(temp.pop());
        }
        */
     }

    // remove from bottom
    static void removeBottom1(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int x = st.pop();
        removeBottom1(st);
        st.push(x);
    }
    static void removeBottom2(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>1){
        temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }
    }
    static void removeBottom3(Stack<Integer> st){
        int n = st.size();
        int[] arr = new int[n-1];
        for(int i=(n-2);i>=0;i--){
            arr[i]=st.pop();
        }
        st.pop();
        for(int i=0;i<(n-1);i++){
            st.push(arr[i]);
        }
    }
    // remove from index
    static void removeFromIndex(Stack<Integer> st, int idx){
        if(st.size()==(idx+1)){
            st.pop();
            return;
        }
        int x = st.pop();
        removeFromIndex(st,idx);
        st.push(x);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);`
    }
}