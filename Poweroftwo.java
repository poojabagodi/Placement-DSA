 class Poweroftwo {
    public static boolean ispower(int n){
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        int n=0b1000;
        System.out.print(ispower(n));
    }
}
