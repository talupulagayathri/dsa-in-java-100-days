public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={10,2,20,3,5,9,12,1};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}