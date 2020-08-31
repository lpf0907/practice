package algorithm.leetcode;

public class RangeBitwiseAnd {
    public static int rangeBitwiseAnd(int m, int n) {
        char[] result = new char[256];
        char[] binaryTmp = new char[256];

        char[] tmp = java.lang.Integer.toBinaryString(m).toCharArray();
        for (int k = 0; k < 256; k++) {
            if (k < tmp.length){
                result[255-k] = tmp[tmp.length-k-1];
            }else {
                result[255-k] = '0';
            }
        }
        System.out.println(result);
        for (int i = m + 1; i <= n; i++) {
            tmp = java.lang.Integer.toBinaryString(i).toCharArray();
            for (int l = 0; l < 256; l++) {
                if (l < tmp.length){
                    binaryTmp[255-l] = tmp[tmp.length-l-1];
                }else {
                    binaryTmp[255-l] = '0';
                }
            }
            System.out.println(binaryTmp);
            for (int j = 255; j >= 0; j--) {
                if (binaryTmp[j] == '1' && result[j] == '1') {
                    result[j] = '1';
                } else {
                    result[j] = '0';
                }
            }
        }
        int value = 0;
        for (int i = 0; i < 256; i++) {
            if (result[i] == '1') {
                value = value + (int) Math.pow(2, (255 - i));
            }
        }
        System.out.println(result);
        return value;
    }
}
