import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(reader.readLine());
        int [] index = IntStream.range(0,26).map(i->  i+= 97).toArray();
        IntStream.range(0,index.length).forEach(i->System.out.print(s.indexOf(String.valueOf((char)index[i]))+" "));
    }
}
