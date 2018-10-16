package algorithm.poj;

import java.util.*;

public class Q1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stringLength = sc.nextInt();
        int stringNumbers = sc.nextInt();
        String[] dnas = new String[stringNumbers];
        int count=0;
        while(count<stringNumbers){
            dnas[count] = sc.next();
            count++;
        }
        sortDna(dnas);
    }

    /**
     * 排序
     * @param dnas
     */
    private static void sortDna(String[] dnas){
        int i = 0;
        Map<String,Integer> result=new TreeMap<String, Integer>();
        while(i<dnas.length){
            result.put(dnas[i],getInversionNum(dnas[i]));
            i++;
        }
        // 按照value的升序比较器
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        };

        // map转换成list进行排序
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(result.entrySet());

        // 排序
        Collections.sort(list,valueComparator);
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey());
        }
    }

    /**
     * 获取每个string的逆序数
     */
    private static int getInversionNum(String dna){
        int count = 0;
        int length = dna.length();
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length-1;j++){
                if (dna.charAt(i)>dna.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
