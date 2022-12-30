import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook2 extends Data {

    public static void main(String[] args) {
        int exit = 8;
        while (exit == 8) {
            System.out.println("Please enter the following details: ");
            System.out.println("1. Create Addressbook");
            System.out.println("2. Edit Addressbook");
            System.out.println("3. Delete Addressbook");
            System.out.println("4: Locate in all Addressbook");
            System.out.println("5: Locate persons with City");
            System.out.println("6. Exit");


            Data ob4 = new Data();

            Scanner sc3 = new Scanner(System.in);
            int inp = sc3.nextInt();

            if (inp == 1) {
                ob4.Create();
            } else if (inp == 2) {

                ob4.EditAddressbook();

            } else if (inp == 3) {

                ob4.DeleteAddressbook();

            } else if(inp == 4) {

                ob4.LocateAcross();

            } else if (inp == 5) {
                ob4.PersonInCity();
            } else if (inp == 6) {
                exit = 9;
            } else
                System.out.println("Enter the valid input");
        }

    }
}
