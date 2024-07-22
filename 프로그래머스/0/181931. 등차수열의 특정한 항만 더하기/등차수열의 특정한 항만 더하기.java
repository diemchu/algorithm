class Solution {
      public  int solution(int a, int d, boolean[] included) {
        int answer = 0 ;
        for(int i= 0 ; i < included.length ; i++){
            System.out.println(a);
            if(included[i]) {
                answer += a;
            }
            a+=d;
        }
        return  answer;
    }

}