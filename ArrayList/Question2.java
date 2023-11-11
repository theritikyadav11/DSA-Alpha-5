import java.util.ArrayList;
import java.util.Collections;

public class Question2 {
    public static void findLonelyNumber(ArrayList<Integer> nums, ArrayList<Integer> ans) {
        // Sorting the array in ascending order
        Collections.sort(nums);

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);

            // Check if the current number is not adjacent to its neighbors
            if ((i == 0 || (nums.get(i - 1) != num - 1 && nums.get(i - 1) != num + 1)) &&
                (i == nums.size() - 1 || (nums.get(i + 1) != num - 1 && nums.get(i + 1) != num + 1))) {
                ans.add(num);
            }
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        ArrayList<Integer> ans = new ArrayList<>();
        findLonelyNumber(nums, ans);

        // Print the lonely numbers
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
