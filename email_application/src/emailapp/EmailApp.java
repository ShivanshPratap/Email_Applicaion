package emailapp;
import java.io.FileWriter;
import java.util.*;

public class EmailApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //User info
        System.out.println("Enter first name:");
        String f_name = s.next();
        System.out.println("Enter last name:");
        String l_name = s.next();

        //creating obj for email class
        Email em1 = new Email(f_name,l_name);
        int choice =-1;
        do {
            System.out.println("\n Enter your choice \n1.Show Info\n2.Change password\n3.change mailbox capacity\n4.Set Alternate mail\n5.Store data in file\n6.Display data stored in file\n7.Exit");
            choice = s.nextInt();
            switch (choice){
                case 1:
                    em1.getInfo();
                    break;
                case 2:
                    em1.set_password();
                    break;
                case 3:
                    em1.set_mailCap();
                    break;
                case 4:
                    em1.setAlter_email();
                    break;
                case 5:
                    em1.storefile();
                    break;
                case 6:
                    em1.read_file();
                    break;
                case 7:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice\n Enter proper choice");

            }
        }while (choice!=7);
    }}
