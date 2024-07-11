import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            i--;j--;
            while (i<j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] =tmp;
                i++;j--;
            }
        }
        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i]);
        br.close();
    }
}