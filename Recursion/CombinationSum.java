// LC 39

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        find(ans, candidates, target, temp, 0);
        return ans;
    }
    public void find(List<List<Integer>> ans, int nums[], int t, List<Integer> temp, int k) {
        if(t < 0) return;
        if(t == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=k; i<nums.length; i++) {
            temp.add(nums[i]);
            find(ans, nums, t-nums[i], temp, i);
            temp.remove(temp.size()-1);
        }
        return;
    }
}