import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int freqsixe = (int)Math.pow(10,6);
        int freq[] = new int [freqsixe];
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        for(int i=0;i<b.length;i++){
            freq[b[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                ans.add(i);
            }
        }
        return ans;
    }
}