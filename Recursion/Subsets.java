import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        find(nums, 0, temp);
        return ans;
    }
    public void find(int nums[], int i, List<Integer> temp) {
        if(i >= nums.length) {
            ans.add(new ArrayList(temp));
            return;
        }
        temp.add(nums[i]);
        find(nums, i+1, temp);
        temp.remove(temp.size() - 1);
        find(nums, i+1, temp);
        return;
    }
}

