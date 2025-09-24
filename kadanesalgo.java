class Solution {
    int maxSubarraySum(int[] arr) {
        int max_sum = Integer.MIN_VALUE; //ab tak max of maximum sums
        int sum_uptohere = 0; // max sum upto here
        for(int i=0;i<arr.length;i++){
            sum_uptohere+=arr[i];
            max_sum = Math.max(max_sum,sum_uptohere);
            if(sum_uptohere<=0){// is sum<0 then yahan se new subaray start
                sum_uptohere=0; // new sum_uptohere start kr;
            }       
        }
        return max_sum;
    }    
    
}
