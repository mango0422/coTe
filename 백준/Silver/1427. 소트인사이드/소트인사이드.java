import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int cnt = n.length();
		Integer[] arr = new Integer[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = (int) n.charAt(i); 
		}
		Arrays.sort(arr, Collections.reverseOrder());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : arr) {
            bw.write(num);
        }
        bw.flush();
        bw.close();
	}

}
