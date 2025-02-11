import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr, g_map;
    static Map<Integer, Integer> g_size = new HashMap<>();
    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];
        g_map = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int g_id = 2;
        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                if(arr[i][j] == 1 && g_map[i][j] == 0){
                    int size = bfs(i, j, g_id);
                    g_size.put(g_id, size);
                    g_id++;
                }
            }
        }

        int max = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 0){
                    max = Math.max(max, convertFunction(i, j));
                }
            }
        }
        System.out.println(max);
    }

    static int bfs(int x, int y, int g_id){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        g_map[x][y] = g_id;
        int size = 1;

        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            int px = pos[0], py = pos[1];

            for(int i = 0; i < 4; i++){
                int nx = px + dx[i], ny = py + dy[i];

                if (nx >=0 && ny >= 0 && nx < N && ny < M){
                    if(arr[nx][ny] == 1 && g_map[nx][ny] == 0){
                        g_map[nx][ny] = g_id;
                        queue.add(new int[]{nx, ny});
                        size++;
                    }
                }
            }
        }
        return size;
    }

    static int convertFunction(int x, int y){
        Set<Integer> oldGroups = new HashSet<>();
        int n = 1;

        for(int i=0; i<4; i++){
            int nx = x + dx[i], ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < M){
                int g_id = g_map[nx][ny];
                if(g_id > 1 && !oldGroups.contains(g_id)){
                    oldGroups.add(g_id);
                    n += g_size.get(g_id);
                }
            }
        }
        return n;
    }
}