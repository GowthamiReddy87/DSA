class Solution {
    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int low=0;
        int high=arr.length;
        int mid=(low+high)/2;
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==k){
            System.out.println(i);
            }
            else if(arr[i]>k)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
return i;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int k=4;
        System.out.println(binarysearch(arr,4));
        
    }
}