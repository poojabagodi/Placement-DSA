public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int v=arr[i];
            int j=i-1;
             while(j>=0 && arr[j]>v){
                arr[j+1]=arr[j];
                j--;
             }
            arr[j+1]=v;
        }
    }
    
    public static void main(String[] args) {
        int arr[]={4,7,2,6,9,2,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
