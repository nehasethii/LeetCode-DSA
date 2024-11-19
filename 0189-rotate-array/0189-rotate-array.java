class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length;
        d =  n - (d % n);
        int i = 0;
        int j = d-1;
        while(i < j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
        i = d;
        j = n - 1;
        while(i < j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
        i = 0;
        j = n - 1;
        while(i < j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr,int idx1 , int idx2)
    {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    } 
}