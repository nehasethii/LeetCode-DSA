class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int dec = -1;
        int i = 0;
        for(i = n - 1; i > 0 ; i--)
        {
            if(arr[i] > arr[i-1])
            {
                dec = i - 1;
                break;
            }
        }
        if(dec != -1)
        {
            for(i = n - 1; i > 0 ; i--)
            {
                if(arr[i] > arr[dec])
                {
                    swap(arr,i,dec);
                    break;
                }
            }
            //java.util.Arrays.sort(arr,dec + 1,n);
            for(i = 0 ; i < (n - dec)/2; i++)
            {
                swap(arr,dec + 1 + i,n - 1 - i);
            }
        }
        else
        {
            for(i = 0 ; i < n/2; i++)
                swap(arr,i,n - 1 - i);
        }
            //java.util.Arrays.sort(arr);
    } 
    static void swap(int[] arr, int i1 , int i2) 
    { 
        int temp = arr[i1]; 
        arr[i1] = arr[i2]; 
        arr[i2] = temp; 
        
    } 
}