class Solution {
     public int solution(int a, int b) {
        int ab = Integer.parseInt(new StringBuilder().append(a).append(b).toString());
        int ba = Integer.parseInt(new StringBuilder().append(b).append(a).toString());
        return  ab > ba ? ab : ba;
    }
}