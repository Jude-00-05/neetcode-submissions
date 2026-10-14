class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map= new HashMap<>();
        for(String s:strs)
        {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String newS=new String(chars);
            map.computeIfAbsent(newS, k -> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
