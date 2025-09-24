import java.util.*;
class Solution {
    public void mergeArrays(int a[], int b[]) {
        int startA=0;
        int startB =0;
        int endA = a.length-1;
        while(startA<=endA && startB<b.length){
            if(a[startA]>b[startB]){ //swap a ka end and b ka start
                int temp = a[endA];
                a[endA] = b[startB];
                b[startB] = temp;
                endA--;
                startB++;
            }
            else{
                startA++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
