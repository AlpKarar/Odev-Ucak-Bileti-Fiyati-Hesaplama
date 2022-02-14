import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int distance, age, type;
        
        
        double PPD = 0.1, totalCost;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Distance(km): ");
        distance = input.nextInt();
        
        System.out.print("Age: ");
        age = input.nextInt();
        
        System.out.print("Type (1 => One-Way, 2 => Return): ");
        type = input.nextInt();
        if (type != 1 && type != 2 && distance < 0) {
            System.out.print("You entered wrong data!");
        }
        
        totalCost = distance * PPD;
        
        if (age < 12) {
            totalCost -= totalCost*0.5;
        } else if (12 <= age && age <= 24) {
            totalCost -= totalCost*0.1;
        } if (65 < age) {
            totalCost -= totalCost*0.3;
        }
        
        if (type == 2) {
            totalCost -= totalCost*0.2;
            totalCost *= 2;
            System.out.print("Total Cost: " + totalCost);
        } else if (type == 1) {
            System.out.print("Total Cost: " + totalCost);
        }
    }
}
