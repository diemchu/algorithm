import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int  t=  Integer.parseInt(reader.readLine());
         Object [] strings =  reader.lines().limit(t).map(String::new).toArray();
        Arrays.stream(strings).forEach(o ->{
                    StringBuilder s = new StringBuilder((String) o);
                      System.out.print(s.charAt(0));
                      System.out.println(s.charAt(s.length()-1));
                }
                );
    }
}
