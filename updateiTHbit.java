public class updateiTHbit {
    public static int set(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int  clear(int n,int i){
        int bitmask= ~(1<<i);
        return n&bitmask;

    }
    
    //first way
    public static int updateF(int n,int i,int newbit){
        if(newbit==0){
            return clear(n,i);
        }
        else{
            return set(n,i);
        }
    }

    //second way

    public static int updateS(int n,int i,int newbit){
        n=clear(n,i);
        int Bitmask=newbit<<i;
        return n | Bitmask;

    }



    public static void main(String[] args) {
        int n=0b110011;
        System.out.println(updateF(n,3,0));
        System.out.println(updateS(n,3,0));
       
    }



}
