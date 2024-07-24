class Solution {
     public String solution(int[] numLog) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
                int diff = numLog[i]-numLog[i-1];
                switch (diff){
                    case 1->s.append("w");
                    case -1->s.append("s");
                    case 10->s.append("d");
                    case -10->s.append("a");
                }

        }
        return s.toString();
    }
}