package greedy.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1931 {
  static int N;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    int count = 0;
    int prev_end_time = 0;
    /*
    time[][0] 은 시작지점을 의미
    time[][1] 은 시작지점을 의미
     */
    int[][] time = new int[N][2];
    StringTokenizer st;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      time[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간 (1,0), (3,0), (0,0), (5,0) ~~
      time[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간 (4,1), (5,1), (6,1), (7,1) ~~
    }

    Arrays.sort(time, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {

        // 종료 시간이 같을 경우 시작시간이 빠른 순으로 정렬
        if (o1[1] == o2[1]) {
          return o1[0] - o2[0];
        }
        return o1[1] - o2[1];
      }
    });
    for (int i = 0; i < N; i++) {
      // 직전 종료 시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
      if (prev_end_time <= time[i][0]) {
        prev_end_time = time[i][1];
        count++;
      }
    }
    System.out.println(count);
  }

}
