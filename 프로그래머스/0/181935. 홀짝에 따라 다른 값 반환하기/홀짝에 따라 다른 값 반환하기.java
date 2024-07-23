import java.util.stream.IntStream;
class Solution {
      public int solution(int n) {
        return n%2!=0 ?
                IntStream.rangeClosed(0, n).filter(v -> v % 2 != 0).sum() :
                IntStream.rangeClosed(0, n).filter(v -> v % 2 == 0).map(v -> (int)Math.pow(v, 2)).sum();
    }
}