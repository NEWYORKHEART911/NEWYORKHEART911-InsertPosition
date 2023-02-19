

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        //My original solution:
        //int tracking = -1;
        //for(int j=0; j<nums.length; j++) {
        //    if(target<nums[j]) {
        //        tracking = j;
        //        break;
        //    }
        //}
        //return tracking==-1 ? nums.length : tracking;

        //Better solution using Binary Search:
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        
        while(leftIndex <= rightIndex) {
            int middle = leftIndex + (rightIndex-leftIndex) / 2;
            if(target < nums[middle]) {
                rightIndex = middle-1;
            } else {
                leftIndex = middle+1;
            }
        }
        return leftIndex;
    }
}
