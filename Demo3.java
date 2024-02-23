import java.util.ArrayList;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[3][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        int count =0;
        for (int i = 0; i < N; i++) {
            if(arr[i][0] == 0 && arr[i][N-1] == 0){
                count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        }else{
            System.out.println("-1");
        }


    }
}
