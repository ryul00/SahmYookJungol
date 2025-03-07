package q1169;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] result;
    static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[N];
		visited = new boolean[7];
		int depth = 0;
		int start = 1;
		sc.close();
		
		if(M == 1) {
			roll1(depth);
		}
		else if (M == 2) {
			roll2(depth, start);
		}
		else if (M == 3) {
			roll3(depth, visited);
		}

	}
	
	public static void roll1(int depth) {
		// M = 1

			if(depth == N) {
				for(int i=0; i< N; i++) {
					System.out.print(result[i] + " ");
				}
				System.out.println();
				return;
			}
			else {
				for(int i=1; i<=6; i++) {
					result[depth] = i;
//					depth++;
					roll1(depth + 1); // 재귀 호출
//					depth = depth - 1;
//					result[depth] = 0;
				}
			}
		}
	
	
	public static void roll2(int depth, int start) {
		// M = 2
			if(depth == N) {
				for(int i=0; i< N; i++) {
					System.out.print(result[i] + " ");
				}
				System.out.println();
				return;
			}
			else {
				for(int i=start; i<=6; i++) {
					result[depth] = i;
					roll2(depth+1, i);
					
				}
			}
		}
	
	public static void roll3(int depth, boolean[] visited) {
		// M = 3
			if(depth == N) {
				for(int i=0; i< N; i++) {
					System.out.print(result[i] + " ");
				}
				System.out.println();
				return;
			}
			else {
				for(int i=1; i<=6; i++) {
					if(visited[i] == false) { // visited[i] 가 false일 때만 조건문 실행 
						visited[i] = true; // visited[1] = true => 주사위 눈 1이 나와서 사용 완료 처리한 것
						result[depth] = i;
						roll3(depth + 1, visited);
						visited[i] = false; // 종료조건에 해당되어 return한 후 다음 백트래킹에서 활성화됨 
					}
				}
			}
	}
	
}


