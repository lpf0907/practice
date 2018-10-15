package algorithm.poj;

import java.util.Scanner;

public class Q1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Integer p = sc.nextInt();
            Integer e = sc.nextInt();
            Integer i = sc.nextInt();
            Integer d = sc.nextInt();
            if (p==-1 && p==e && e==i && i==d){
                break;
            }
            System.out.println("finished");
        }
    }
}
