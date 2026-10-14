class Solution {
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            result.append(s.length());
            result.append('#');
            result.append(s);
        }

        return result.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // Find the delimiter after the length
            int delimiter = s.indexOf('#', i);

            // Read the length
            int len = Integer.parseInt(s.substring(i, delimiter));

            // Extract the original string
            String curr = s.substring(delimiter + 1, delimiter + 1 + len);
            result.add(curr);

            // Move to the next encoded string
            i = delimiter + 1 + len;
        }
        return result;
    }
}