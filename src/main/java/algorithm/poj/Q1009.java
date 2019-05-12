package algorithm.poj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1009 {
    public static void main(String[] args) {
        // 数据属性
        int length = 0;
        ArrayList<Integer> mapNum = new ArrayList<Integer>();
        Integer[][] map;
        //输入
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] input = str.split(" ");
            //输入处理
            if (input.length == 1 ) {
                //处理长度、结束
                if( Integer.parseInt(input[0]) == 0){
                    break;
                }else {
                    length =Integer.parseInt(input[0]);
                }
            }else {
                //录入图像数据
                if (Integer.parseInt(input[0]) == 0 && Integer.parseInt(input[1]) == 0){
                    handle(mapNum,length);
                    mapNum = new ArrayList<Integer>();
                }else {
                    for (int i = 0 ; i<Integer.parseInt(input[1]);i++){
                        mapNum.add(Integer.parseInt(input[0]));
                    }
                }
            }
        }
    }

    //图像处理
    private static void handle(ArrayList<Integer> mapNum, int length){
        System.out.println(mapNum);

    }
}
