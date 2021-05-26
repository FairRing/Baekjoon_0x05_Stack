import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); // 출력할 결과물 저장

		// SET number, stack...
		int number = 0;
		int start = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		while ((number < 1) || (number > 100000)) {
			number = in.nextInt();
			stack.clear();
		}
		
		// loop start
		while (number-- > 0) {

			int value = in.nextInt();

			if (value > start) {
				// PUSH..."+"
				for (int i = start+1; i <= value; i++) {
					stack.push(i);
					sb.append('+');
					sb.append('\n');
				}
				start = value;
			}

			if (stack.peek() != value) {
				System.out.println("NO");
				return;
			}

			// POP... "-"
			stack.pop();
			sb.append('-').append('\n');
		}
		// loop end

		System.out.println(sb);
		
		in.close();
	}
}