package algorithm.poj;

import java.util.Map;
import java.util.Scanner;

public class Q1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int i = 0;
        while (i < nums) {
            i++;
            String phoneNum = sc.next();
            //判断结果用map表示，号码+次数
            Map<String, Integer> result = phoneNumProcess(phoneNum);
        }
    }

    //结果处理函数
    static Map<String, Integer> phoneNumProcess(String phoneNum) {
        Map<String, Integer> result = null;
        System.out.println(standartNumber(phoneNum));
        return result;
    }

    //标准号码变换函数
    static String standartNumber(String phoneNum) {
        String result;
        phoneNum.replaceAll("-", "");
        char[] charPhoneNum = phoneNum.toCharArray();
        char[] newPhoneNum = new char[8];
        for (int i= 0 ;i<8;i++){
            if(i==3){
                newPhoneNum[i] = '-';continue;
            }else if (i>3){
                newPhoneNum[i] = mapperProcess(charPhoneNum[i-1]);continue;
            }else if(i<3){
                newPhoneNum[i] = mapperProcess(charPhoneNum[i]);
            }
        }
        result = String.valueOf(newPhoneNum);
        return result;
    }

    //映射函数
    static char mapperProcess(char character) {
        char result;
        switch (character) {
            case 'A':
            case 'B':
            case 'C':
                result = '2';
                break;
            case 'D':
            case 'E':
            case 'F':
                result = '3';
                break;
            case 'G':
            case 'H':
            case 'I':
                result = '4';
                break;
            case 'J':
            case 'K':
            case 'L':
                result = '5';
                break;
            case 'M':
            case 'N':
            case 'O':
                result = '6';
                break;
            case 'P':
            case 'R':
            case 'S':
                result = '7';
                break;
            case 'T':
            case 'U':
            case 'V':
                result = '8';
                break;
            case 'W':
            case 'X':
            case 'Y':
                result = '9';
                break;
            default:
                result = character;
        }
        return result;
    }
}
