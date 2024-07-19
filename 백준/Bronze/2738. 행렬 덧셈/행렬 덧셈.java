import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(line.nextToken());
        int m = Integer.parseInt(line.nextToken());

        int [][] arr1 = new int[n][m];
        int [][] arr2 = new int[n][m];


          String [] line1 =   reader.lines().limit(n).toArray(String[]::new);
          String [] line2 =   reader.lines().limit(n).toArray(String[]::new);
          for(int i = 0 ; i <  n ; i++){
              arr1[i] = Arrays.stream(line1[i].split(" ")).mapToInt(Integer::parseInt).toArray();
              arr2[i] = Arrays.stream(line2[i].split(" ")).mapToInt(Integer::parseInt).toArray();
          }

           for(int i=0 ; i < n ; i++){
               for(int j= 0; j < m ; j++){
                   System.out.print(arr1[i][j]+arr2[i][j] + " ");
               }
               System.out.println();
           }


    }
}
