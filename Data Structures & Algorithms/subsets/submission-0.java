class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        generate(nums, 0, list, result);

        return result;

    }

    void generate(int[] nums, int index, ArrayList<Integer> list, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        generate(nums, index+1, list, result);

        list.remove(list.size()-1);
        generate(nums, index+1, list, result);
    }
}
