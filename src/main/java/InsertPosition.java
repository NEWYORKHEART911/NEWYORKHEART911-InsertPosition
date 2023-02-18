

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
        //this seems like the best solution without adding extra operations like using a temp array with length nums+1
        //i guess its possible to do some sort of binary search to more quickly find the insertion point..
        //ill have to come back to this problem
        int tracking = -1;
        for(int j=0; j<nums.length; j++) {
            if(target<nums[j]) {
                tracking = j;
                break;
            }
        }
        return tracking==-1 ? nums.length : tracking;
    }
}
