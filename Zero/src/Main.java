import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int k = 0;	//입력할 정수의 갯수
		int n = -1; //입력할 정수
		
		int sum = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		try {
			
			// SET K(1 <= k <= 100000)
			while ((k < 1) || (k > 100000)) {
				k = Integer.parseInt(br.readLine());
				stack.clear();
			}
			
			// SET STACK
			for (int i = 0; i < k; i++) {
				n = Integer.parseInt(br.readLine());
				if (i < 1) {
					if (n == 0) {
						
					} else {
						stack.push(n);
					}
				} else {
					if (n == 0) {
						stack.pop();
					} else {
						stack.push(n);
					}
				}
			}
			
			if (stack.isEmpty()) {
				bw.write(String.valueOf(0) + "\n");
			} else {
				for (int i = 0; i < stack.size(); i++) {
					sum += stack.get(i);
				}
				bw.write(String.valueOf(sum) + "\n");
			}
			
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}