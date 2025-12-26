package Practice;


    import java.util.*;

public class ThreeSumSolution {

    // Function to find all unique triplets with sum = 0
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if (nums == null || nums.length == 0) {
            return new ArrayList<>(res);
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum > 0) {
                    k--;
                } else { // sum < 0
                    j++;
                }
            }
        }

        return new ArrayList<>(res);
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        ThreeSumSolution sol = new ThreeSumSolution();

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = sol.threeSum(nums);

        System.out.println(result);
    }
}

    

