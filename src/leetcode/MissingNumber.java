package leetcode;

public class MissingNumber {

	public static int missingNumber(int[] nums) {

		int n = nums.length;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : nums) {
			actualSum += num;
		}

		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		int ret;
		int[] nums1 = { 3, 0, 1 };

		ret = new MissingNumber().missingNumber(nums1);
		System.out.println(ret); // Output: 2

		int[] nums2 = { 0, 1 };
		ret = new MissingNumber().missingNumber(nums2);
		System.out.println(ret); // Output: 2

		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		ret = new MissingNumber().missingNumber(nums3);
		System.out.println(ret); // Output: 2
	}

}
