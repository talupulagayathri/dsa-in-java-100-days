public class Floor{//to print arr[indexed]=value--which is nearest to the key(x)
    public static void main(String[] args) {//right side value
        // code here
        int[] arr={1,2,3,4,5,7,8,9,10};//except the key(x)
        int x=6;
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            
            if(arr[mid]>x){
                ans=arr[mid];
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}

