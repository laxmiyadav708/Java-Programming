import java.util.Random;

public class jaggedarrays {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] jagged = new int[4][];
        jagged[0] = new int[3];  
        jagged[1] = new int[5];  
        jagged[2] = new int[2];  
        jagged[3] = new int[4];  


        for (int[] row : jagged) {
            for (int j = 0; j < row.length; j++) {
                row[j] = rand.nextInt(100);
            }
        }

        
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
