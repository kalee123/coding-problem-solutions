/**
 153. Find Minimum in Rotated Sorted Array
Medium

4361

335

Add to List

Share
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

*/

// Method 1

class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(nums[0]<nums[n-1])
            return nums[0];
        
        int start=0,end=n-1;
        while(start<end){
            int mid=(start+end)/2;
           // System.out.println(nums[mid]);
            if(nums[start]>nums[end]){
                if(nums[mid]>nums[start] || nums[mid]>nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
            else{
                end=mid;
            }
        }
        
        return nums[start];
    }
}

// Method 2

class Solution {
    public int findMin(int[] nums) {
                int n=nums.length;
        int start=0,end=n-1;
        if(n==1)
            return nums[0];

        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[end])
                start=mid+1;
            else
                end=mid;
        }
        
        return nums[end];
    }
}
