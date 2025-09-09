import java.util.ArrayList;

public class removingduplicates {
public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        System.out.println( colors);

        colors.remove("blue");

        System.out.println(colors);
    }
}
