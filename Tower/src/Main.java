import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Tower {
    int number;
    int height;

    Tower(int number, int height) {
        this.number = number;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Stack<Tower> stack = new Stack<Tower>();
        StringBuilder result = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(st.nextToken());

            if (stack.isEmpty()) {
                result.append("0 "); //check empty tower
                stack.push(new Tower(i, height));
            } else {
                while (true) {
                    if (stack.isEmpty()) { // null --> end
                        result.append("0 ");
                        stack.push(new Tower(i, height));
                        break;
                    }

                    Tower tower = stack.peek();

                    if (tower.height > height) { 
                        result.append(tower.number + " "); 
                        stack.push(new Tower(i, height)); 
                        break;
                    } else { 
                        stack.pop(); 
                    }
                }
            }
        }

        bw.write(result.toString() + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }

}