class Solution {
       public String solution(int q, int r, String code) {
            StringBuilder s = new StringBuilder();
            char [] chars = code.toCharArray();
            for(int i = 0 ; i < chars.length ;i++){
                if(i%q == r) s.append(chars[i]);
            }
            return  s.toString();
        }
}