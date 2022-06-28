//Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
//In case of multiple subArrays, return the subArray which comes first on moving from left to right.
//Example 1:
//Input:
//N = 5, S = 12
//A[] = {1,2,3,7,5}
//Output: 2 4
//Explanation: The sum of elements
//from 2nd position to 4th position is 12.

package Coding_Quest;

import java.util.HashMap;

public class SubArr_Sum {
    public static int solution(int [] arr, int target){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum - target)){
                ans += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0)+ 1);
        }

        return ans;
    }


}
