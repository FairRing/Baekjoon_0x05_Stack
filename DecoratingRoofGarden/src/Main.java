import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0; // 입력할 정수의 갯수
		long hi = 0; // 입력할 정수
		long[] building = null;
		boolean loopStop = true;
		long total = 0;
		
		Stack<Integer> stack = new Stack<Integer>();

		try {

			// SET K(1 <= k <= 100000)
			while ((n < 1) || (n > 80000)) {
				n = Integer.parseInt(br.readLine());
				stack.clear();
			}

			// SET BUILDING
			building = new long[n + 1];// start=1 end=n
			while (true) {
				for (int i = 1; i < n + 1; i++) {
					hi = Integer.parseInt(br.readLine());
					building[i] = hi;
				}

				for (int i = 1; i < building.length; i++) {
					if ((building[i] < 1) || (building[i] > 1000000000)) {
						loopStop = false;
						building = null;
						break;
					} else {
						loopStop = true;
					}
				}
				if (loopStop)
					break;
			}
			
			// CHECK
			for (int i = 1; i < building.length-1; i++) {
				for (int j = i+1; j < building.length; j++) {
					if (building[i] > building[j]) {
						total++;
					} else {
						break;
					}
				}
			}

			System.out.println(total);

			br.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}