import java.util.ArrayList;
import java.util.List;

public class Rectangle {
    public static int[] constructRectangle(int area){
        int[] out = new int[2];
        for (int i=1; i<=area; i++){
            if (area%i == 0){
                List<Integer> list = new ArrayList<>();
                int a = i;
                int b = area/i;
                if (a >= b) {
                    out[0] = a;
                    out[1] = b;
                    break;
                }
            }
        }

        return out;
    }
    public static void main(String[] args) {
        constructRectangle(122122);
    }
}
