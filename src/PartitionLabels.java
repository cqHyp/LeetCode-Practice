import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    private List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        char[] arr = S.toCharArray();
        int temp = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == temp + sum - 1){
                sum = sum + temp;
                result.add(temp);
                temp = 0;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i] && j + 1 - i >= temp) {
                    temp = j + 1 - i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PartitionLabels partitionLabels = new PartitionLabels();
        List<Integer> list = partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
