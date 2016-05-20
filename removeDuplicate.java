public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        System.out.println(length);
        if (length == 0) {
			return 0;
		}
        int sum = 0;
        // 注意这里是 i = 1，对于去重题，第一个跳过
        for (int i = 1; i < nums.length; i++) {
        	if (nums[i] != nums[sum]) {
				sum ++;
				nums[sum] = nums[i];
			}
		}
		// 因为跳过第一个所以要+1
        return sum + 1;
    }
}


public class Solution {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        // 注意这里是从0开始，和已知的值比较
        for (int i = 0; i < nums.length; i++){
            if(val != nums[i]){
                nums[m] = nums[i];
                m++;
            }
        }
        // 这里不需要+0， 因为是已知的值
        return m;
    }
}