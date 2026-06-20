public class Selectionsort {
    public static void main(String[] args){
        int[] arr={10,2,20,3,5,9,12,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}