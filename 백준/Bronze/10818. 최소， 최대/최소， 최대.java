import java.io.*;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0;
        int min = 0;
        int max = 0;
        try{
            n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] str = br.readLine().split(" ");
            br.close();
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str[i]);
                if(i != 0) {
                    if(arr[i] < min){
                        min = arr[i];
                    } else if(arr[i] > max){
                        max = arr[i];
                    }
                } else{
                    min = arr[i];
                    max = arr[i];
                }
            }
            bw.write(min + " " + max);
            bw.flush();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}