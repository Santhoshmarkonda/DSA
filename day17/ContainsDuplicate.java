package ps.day17;

public class ContainsDuplicate {

	public static boolean getDistinct(int arr[]) {
		boolean isPresent = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isPresent = true;
				}
			}
		}

		return isPresent;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println("Array element repeated? " + getDistinct(nums));
	}

}

// Time Complexity: O(n*n)

//  second approach:
//
//  int nums[] = {1,2,3,1};
//
//  Arrays.sort(nums);
//
//  for(int i = 0; i < nums.length; i++) {
//	    if(nums[i] == nums[i+1]) {
//		    isPresent = true;
//	    }
//  }
//  
//  Time Complexity for second Approach is: O(n)
