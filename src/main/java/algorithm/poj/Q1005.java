package algorithm.poj;

import java.util.Scanner;

public class Q1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() * 2;
        float[] a = new float[N];
        int m = 0;
        while(sc.hasNext()){
            a[m] = sc.nextFloat();
            m++;
        }
        float[] squar = new float[N/2];
        for (int i = 0;i<N-1;i=i+2){
            int j = 0;
            squar[j] = a[i] * a[i+1] * (float) Math.PI/2;
        }
        for (int k = 0; k<N/2;k++){
            int tmp = (int)Math.ceil(squar[k]/50);
            System.out.println("Property "+k+": This property will begin eroding in year "+tmp+".");
        }
        System.out.println("END OF OUTPUT.");
    }
}
