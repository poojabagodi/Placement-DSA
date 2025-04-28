import java.util.*;
public class ReverseStrUsingStack {
    public static String reverse(String str){
      Stack<Character> s=new Stack<>();
      int idx=0;
      while(idx<str.length()){
        s.push(str.charAt(idx));
        idx++;
      }
      StringBuilder result=new StringBuilder("");
      while(!s.isEmpty()){
        result.append(s.pop());

      }
      return result.toString();
    }

    public static void main(String[] args) {
        String str="pooja";
        System.out.println(reverse(str));
    }
}
