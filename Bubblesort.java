public class Bubblesort {
  public static void Bubble( int arr[]){
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
     }
  } 
  
  public static void main(String[] args) {
    int arr[]={5,7,8,3,8};
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    Bubble(arr);
    System.out.println();
    for(int i=0;i<arr.length;i++){
      
        System.out.print(arr[i]+" ");
    }
  }
}
