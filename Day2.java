public class Day2 {
    public static void main(String[] args){
        int[] arr={10,2,20,3,5,9,12,1};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
            }
            for(int a:arr){
                System.out.print(a+" ");
        }
    }
}