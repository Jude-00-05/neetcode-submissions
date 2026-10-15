class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums) set.add(i);
        int max=0;
        for(int num:set)
        {
            
            if(!set.contains(num-1)){
                int currMax=1;
                int i=1;
                while(set.contains(num+i)){
                    currMax++;
                    i++;
                                       
                }
                max=Math.max(max,currMax);
            }

        }
        return max;
    }
}
