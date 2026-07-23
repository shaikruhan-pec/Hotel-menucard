import java.util.Scanner;

public class hotelMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String customerName, mobileNo;

        String[] itemName = new String[50];
        int[] quantity = new int[50];
        double[] price = new double[50];
        double[] amount = new double[50];

        int count = 0;
        double grandTotal = 0;

        int choice;
        int item;
        int qty;
        int another = 1;

        System.out.println("========================================");
        System.out.println("        WELCOME TO RUHA's HOTEL");
        System.out.println("========================================");

        System.out.print("Customer Name : ");
        customerName = sc.nextLine();

        System.out.print("Mobile Number : ");
        mobileNo = sc.nextLine();

        while (another == 1) {

            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Veg");
            System.out.println("2. Non-Veg");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice)
            {

                // ================= VEG =================

                case 1:

                    System.out.println("\n--- VEG MENU ---");
                    System.out.println("1. Veg Fried Rice - Rs.120");
                    System.out.println("2. Paneer Butter Masala - Rs.180");
                    System.out.println("3. Gobi Manchurian - Rs.150");

                    System.out.print("Select Item : ");
                    item = sc.nextInt();

                    switch(item)
                    {
                        case 1:
                            itemName[count] = "Veg Fried Rice";
                            price[count] = 120;
                            break;

                        case 2:
                            itemName[count] = "Paneer Butter Masala";
                            price[count] = 180;
                            break;

                        case 3:
                            itemName[count] = "Gobi Manchurian";
                            price[count] = 150;
                            break;

                        default:
                            System.out.println("Invalid Item!");
                            continue;
                    }

                    System.out.print("Enter Quantity : ");
                    qty = sc.nextInt();

                    quantity[count] = qty;
                    amount[count] = qty * price[count];

                    grandTotal += amount[count];

                    System.out.println("Item : " + itemName[count]);
                    System.out.println("Amount : Rs." + amount[count]);

                    count++;

                    break;
                                    // ================= NON-VEG =================

                case 2:

                    System.out.println("\n--- NON-VEG MENU ---");
                    System.out.println("1. Chicken Biryani - Rs.250");
                    System.out.println("2. Chicken Fried Rice - Rs.180");
                    System.out.println("3. Mutton Curry - Rs.300");

                    System.out.print("Select Item : ");
                    item = sc.nextInt();

                    switch(item)
                    {
                        case 1:
                            itemName[count] = "Chicken Biryani";
                            price[count] = 250;
                            break;

                        case 2:
                            itemName[count] = "Chicken Fried Rice";
                            price[count] = 180;
                            break;

                        case 3:
                            itemName[count] = "Mutton Curry";
                            price[count] = 300;
                            break;

                        default:
                            System.out.println("Invalid Item!");
                            continue;
                    }

                    System.out.print("Enter Quantity : ");
                    qty = sc.nextInt();

                    quantity[count] = qty;
                    amount[count] = qty * price[count];

                    grandTotal += amount[count];

                    System.out.println("Item : " + itemName[count]);
                    System.out.println("Amount : Rs." + amount[count]);

                    count++;

                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.print("\nDo you want another item? (1-Yes / 2-No): ");
            another = sc.nextInt();

        }
                // =============== FINAL BILL ==================

        System.out.println("\n==============================================================");
        System.out.println("                    RUHA's HOTEL BILL");
        System.out.println("==============================================================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNo);
        System.out.println("--------------------------------------------------------------");

        System.out.printf("%-25s %-8s %-10s %-10s\n",
                "Item", "Qty", "Price", "Amount");

        System.out.println("--------------------------------------------------------------");

        for(int i = 0; i < count; i++)
        {
            System.out.printf("%-25s %-8d %-10.2f %-10.2f\n",
                    itemName[i],
                    quantity[i],
                    price[i],
                    amount[i]);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("Grand Total : Rs. %.2f\n", grandTotal);
        System.out.println("==============================================================");
        System.out.println("             THANK YOU! VISIT AGAIN!!");
        System.out.println("==============================================================");

        sc.close();

    }
}