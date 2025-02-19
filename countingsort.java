public class countingsort {
    public static void count(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
             }
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }
    }


    public static void main(String[] args) {
        int arr[]={7,3,4,5,7,8,3,4,5,7,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        count(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
