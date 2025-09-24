public class moveallnegativetostart{
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int start=0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]<0 && start<end){
                start++;
            }
            if(arr[end]>0 && start<end){
                end--;
            }
            if((arr[end]<0 && arr[start]>0)&& start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}