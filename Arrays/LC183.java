// Time : O(N)
// Space : O(N)


class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestStreak = 0;
        for(int num: nums){
            set.add(num);
        }

        for(int num : nums){
            // only if there isnt any smaller number(number-1) in the array
            if(!set.contains(num - 1)){
                int start_seq = num;
                int length = 1;
            
                // now calculate the consectuive numbers
                while(set.contains(start_seq+1)){
                    length += 1;
                    start_seq += 1;
                }

                longestStreak = Math.max(longestStreak, length);
            }

        }

        return longestStreak ;
    }
}