package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_2441 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= T; i++) {
      for (int j = 1; j < i; j++) {
        sb.append(" ");
      }
      for (int k = T; k >= i; k--) {
        sb.append('*');
      }
      sb.append('\n');
    }
    System.out.print(sb);
  }
}
