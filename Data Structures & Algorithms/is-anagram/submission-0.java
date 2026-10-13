class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars=new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            chars[t.charAt(i)-'a']--;
        }
        for(int i:chars)
        {
            if(i!=0) return false;
        }
        return true;
    }
}
