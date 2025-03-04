public class clearlastiTHbits {
    public static int clearlast(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        int n=0b00110;
        System.out.println(Integer.toBinaryString(clearlast(n, 1)));
    }
}
