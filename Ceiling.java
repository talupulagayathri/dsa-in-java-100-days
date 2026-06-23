public class Ceiling{//to print arr[indexed]=value--which is nearest to the key(x)
    public static void main(String[] args){//ceiling means left side value
        int[] arr={1,2,3,4,5,7,8,9,10};//except 6 it is the key value
        int ans=-1;
        int key=6;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
           
            if(arr[mid]<key){
                ans=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}