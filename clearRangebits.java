public class clearRangebits {
    public static int clear(int n,int i,int j){
           int a=(~0)<<(j+1);
           int b=(1<<i)-1;
           int bitmask=a | b;
           return n & bitmask;
    }

    public static void main(String[] args) {
        int n=0b110011;
        System.out.println(Integer.toBinaryString(clear(n,2,3)));
    }
}
