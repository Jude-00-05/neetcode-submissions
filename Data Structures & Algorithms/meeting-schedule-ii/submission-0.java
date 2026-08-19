/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int[] start=new int[intervals.size()];
        int[] end=new int[intervals.size()];
        int index=0;
        for(Interval i:intervals){
            start[index]=i.start;
            end[index]=i.end;
            index++;
        }
        int rooms=0;
        int max=0;
        Arrays.sort(start);
        Arrays.sort(end);
        int st=0;
        int ed=0;
        while(st<start.length && ed<start.length ){
            if(start[st]<end[ed]){
                rooms++;
                st++;
                max=Integer.max(rooms,max);
            }
            else {
                rooms--;
                ed++;
            }
            
        
        }
        return max;
    }
}
