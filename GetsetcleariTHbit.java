class GetsetcleariTHbit{
    public static int get(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int set(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int  clear(int n,int i){
        int bitmask= ~(1<<i);
        return n&bitmask;

    }

    public static void main(String[] args){
        int n=0b1110001;
        System.out.println(get(n,3));
        System.out.println(set(n,3));
        System.out.println(clear(n,3));
    
    }
}