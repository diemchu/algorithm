import java.util.stream.IntStream;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, int[] index_list) {
       return IntStream.of(index_list).mapToObj(my_string::charAt).map(String::valueOf).collect(Collectors.joining());
    }
}