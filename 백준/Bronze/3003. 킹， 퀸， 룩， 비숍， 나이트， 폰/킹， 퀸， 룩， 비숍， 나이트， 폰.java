import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        int baseCount[] = {1,1,2,2,2,8};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line  = reader.readLine();
        String[] tokens = line.split(" ");
        IntStream.range(0, baseCount.length  ).forEach(
                i-> System.out.print(baseCount[i]- Integer.parseInt(tokens[i])+" ")
        );
    }
}