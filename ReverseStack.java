import java.util.Stack;

public class ReverseStack {
     public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
          s.push(data);
          return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void revstack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revstack(s);
        pushAtBottom(s, top);


    }

    public static void printstck(Stack<Integer> s){
        while(!s.isEmpty()){
        System.err.println(s.pop());
        
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //printstck(s);
        revstack(s);
        printstck(s);


    }
}
