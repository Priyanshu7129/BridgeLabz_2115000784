import java.util.Scanner;
class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }   
        int youngestIndex = 0;
        double tallestHeight = heights[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
            }
        }     
        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest height: " + tallestHeight);
    }
}