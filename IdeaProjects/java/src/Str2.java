import java.util.Arrays;

public class Str2 {
    public static void main(String[] args) {

        String str = "hfdgfdgdghdjkfhsaeuyteughbv";
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length() ;i++){
            char c = str.charAt(i);
            int index = c - 'a';
            arr[index] += 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
