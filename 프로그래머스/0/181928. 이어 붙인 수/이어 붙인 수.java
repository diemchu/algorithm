class Solution {
        public int solution(int[] num_list) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        for (int i : num_list) {
            if (i % 2 == 0) n1.append(String.valueOf(i));
            else n2.append(String.valueOf(i));
        }
        return Integer.parseInt(n1.toString()) + Integer.parseInt(n2.toString());
    }
}