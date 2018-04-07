package algorithm.poj;

import java.util.*;

public class Q1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int i = 0;
        String[] resultList = new String[nums];
        while (i < nums) {
            String phoneNum = sc.next();
            resultList[i] = standartNumber(phoneNum);
            i++;
        }
        finalProcess(resultList);
    }

    //最终处理
    static void finalProcess(String[] resultList){
        int length = resultList.length;

        TreeMap<String, Integer> resultMap = new TreeMap<String, Integer>();
        for (int k = 0; k < length; k++) {
            int counter = 1;
            int j = k + 1;
            while (j < length) {
                if (resultList[k].equals(resultList[j])) {
                    counter++;
                    resultMap.put(resultList[k], counter);
                    resultList[j] = "0";
                }
                j++;
            }
        }
        if (resultMap != null) {
            for (Object tmp : resultMap.keySet()) {
                if (!tmp.equals("0"))
                System.out.println(tmp + " " + resultMap.get(tmp));
            }
        } else {
            System.out.println("No duplicates");
        }
    }

    //标准号码变换函数
    static String standartNumber(String phoneNum) {
        String result;
        String newphone = phoneNum.replaceAll("-", "");
        char[] charPhoneNum = newphone.toCharArray();
        char[] newPhoneNum = new char[8];
        for (int i = 0; i < 8; i++) {
            if (i < 3) {
                newPhoneNum[i] = mapperProcess(charPhoneNum[i]);
                continue;
            } else if (i > 3) {
                newPhoneNum[i] = mapperProcess(charPhoneNum[i - 1]);
                continue;
            } else if (i == 3) {
                newPhoneNum[i] = '-';
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
