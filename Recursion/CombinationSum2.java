// LC 40

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if(i > k && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            find(ans, nums, t-nums[i], temp, i+1);
            temp.remove(temp.size()-1);
        }
        return;
    }
}