import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(reader.readLine()).append("\n");
       stringBuilder.append(reader.readLine());
       String[] strings = stringBuilder.toString().split("\n");
       System.out.println(strings[0].toCharArray()[Integer.parseInt(strings[1])-1]);
   }
}