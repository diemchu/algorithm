import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
public class Main {
   public static void main(String[] args) {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       boolean[] done = new boolean[31];
       reader.lines().limit(28)
               .mapToInt(Integer::parseInt)
               .forEach(i -> done[i] = true);

       StringBuilder answer = new StringBuilder();
       IntStream.range(1, done.length)
               .forEach(i -> {
                   if(!done[i]) answer.append(i).append('\n');
               });
       System.out.print(answer);
   }
}