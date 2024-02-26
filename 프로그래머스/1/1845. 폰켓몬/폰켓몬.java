import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i = 0 ; i < nums.length;i++ ) {
            if(!(arr.contains(nums[i]))) {
                arr.add(nums[i]);
            }
            /*loop : for(int j = 0 ; j < arr.size(); j++) {
                if(nums[i] != arr.get(j)) {
                    arr.add(nums[i]);
                    System.out.println("nums[i] : "+nums[i]);
                    System.out.println("arr.get() : "+arr.get(j));
                    break loop;
                }
            }*/
        }
        System.out.println("arr : "+arr);
      
        
        int answer = 0;
        return nums.length / 2 < arr.size() ? nums.length / 2 : arr.size();
    }
}