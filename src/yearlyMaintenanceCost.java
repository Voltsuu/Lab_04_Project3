import java.util.Scanner;

public class yearlyMaintenanceCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int springMaintenance;
        int summerMaintenance;
        int fallMaintenance;
        int winterMaintenance;

        System.out.println("What is the cost of your spring maintenance?");
        springMaintenance = scan.nextInt();
        System.out.println("What is the cost of your summer maintenance?");
        summerMaintenance = scan.nextInt();
        System.out.println("What is the cost of your fall maintenance?");
        fallMaintenance = scan.nextInt();
        System.out.println("What is the cost of your winter maintenance?");
        winterMaintenance = scan.nextInt();

        int total = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;

        System.out.println("Your yearly maintenance cost is $ " + total);
    }
}