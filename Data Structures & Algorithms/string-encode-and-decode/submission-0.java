

class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String str : strs) {

            sb.append(str.length());
            sb.append("#");
            sb.append(str);

        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find the separator #
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length of the original string
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            String word = str.substring(j + 1, j + 1 + length);

            result.add(word);

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return result;
    }
}
