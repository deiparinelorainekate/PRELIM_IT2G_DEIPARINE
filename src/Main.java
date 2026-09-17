import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Prompts
        System.out.println("=== HOTEL RESERVATION SYSTEM ===");
        System.out.print("Enter Guest Name: ");
        String guestName = scanner.nextLine();

        System.out.print("Enter Number of Nights: ");
        int numberOfNights = scanner.nextInt();

        System.out.print("Enter Standard Room Rate per Night: ");
        double roomRatePerNight = scanner.nextDouble();

        System.out.print("VIP Membership Status (true/false): ");
        boolean isVip = scanner.nextBoolean();

        // Calculations
        double baseTotal = numberOfNights * roomRatePerNight;
        double discount = 0.0;

        // Long-Stay Discount: 5 nights or longer -> 10% off
        if (numberOfNights >= 5) {
            discount = baseTotal * 0.10;
        }

        double finalTotal = baseTotal - discount;

        // VIP Upgrade Eligibility: VIP status is true AND Number of Nights >= 3
        String roomType;
        if (isVip && numberOfNights >= 3) {
            roomType = "Complimentary Suite Upgrade";
        } else {
            roomType = "Standard Room";
        }

        // Output Summary
        System.out.println("\n===================================");
        System.out.println("       RESERVATION DETAILS         ");
        System.out.println("===================================");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Assigned Room: " + roomType);
        System.out.println("Length of Stay: " + numberOfNights + " night(s)");
        System.out.println("Base Total: $" + String.format("%.2f", baseTotal));
        System.out.println("Discount Applied: $" + String.format("%.2f", discount));
        System.out.println("Final Total Amount: $" + String.format("%.2f", finalTotal));
        System.out.println("===================================");

        scanner.close();
    }
}