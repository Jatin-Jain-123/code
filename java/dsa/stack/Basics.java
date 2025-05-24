import java.util.Stack;
public class Basics{

    // implement print stack
    static void printStack(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int x = st.pop();
        printStack(st);
        System.out.print(x+" ");
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
    static void reverse(Stack<Integer> st){
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


    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        printStack(st);
    }
}