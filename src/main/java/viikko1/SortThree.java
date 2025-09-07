package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int min_var = Math.min(a, Math.min(b, c));
        int max_var = Math.max(a, Math.max(b, c));
        int mid_var = a + b + c - min_var - max_var;
        return min_var + "," + mid_var + "," + max_var;
    }
}
