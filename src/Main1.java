
import java.io.IOException;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        Garage garage = new Garage();
        Admin admin = null;
        User user1 = null;
        garage.setTotalslots(10);
        String adminName = "", userName = "", carName = "";
        int adminID = 0, slotID = 0, slotWidth, slotDepth, userID = 0, carID = 0, year = 0, cardepth = 0, carwidth = 0;

        while (true) {
            System.out.println("[1]Add Admin ");
            System.out.println("[2]Add slot");
            System.out.println("[3]park in User car ");
            System.out.println("[4]print avaliable slots");
            System.out.println("[5]park out User car ");
            System.out.println("[6] get total income ");

            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter your choice ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter Admin name  ");
                    adminName = input.next();
                    System.out.println("Please Enter Admin ID  ");
                    adminID = input.nextInt();
                    admin = new Admin(adminName, adminID, garage);
                    garage.setAdmin(admin);
                    break;
                case 2:
                    System.out.println("Please Enter slot ID  ");
                    slotID = input.nextInt();
                    System.out.println("Please Enter slot width  ");
                    slotWidth = input.nextInt();
                    System.out.println("Please Enter slot depth  ");
                    slotDepth = input.nextInt();
                    Dimensions slot1 = new Dimensions(slotWidth, slotDepth, slotID);
                    garage.AddAvilableslots((IDimensions) slot1);
                    break;
                case 3:
                    System.out.println("Please Enter User name  ");
                    userName = input.next();
                    System.out.println("Please Enter User ID  ");
                    userID = input.nextInt();

                    System.out.println("Please Enter car name  ");
                    carName = input.next();
                    System.out.println("Please Enter car ID  ");
                    carID = input.nextInt();
                    System.out.println("Please Enter car year   ");
                    year = input.nextInt();
                    System.out.println("Please Enter car depth   ");
                    cardepth = input.nextInt();
                    System.out.println("Please Enter car width   ");
                    carwidth = input.nextInt();

                    user1 = new User(userName, userID,
                            new parking(new Vehicle(carName, carID, year, cardepth, carwidth)));
                    user1.park.parkin(garage);
                    TimeUnit.SECONDS.sleep(2);
                    break;
                case 4:
                    admin.printSlots();
                    break;
                case 5:
                    user1.park.parkOut(garage);
                    break;
                case 6:
                    admin.printTotalincome();
                    break;
                default:
                    out.println("GOOD BYE");
                    System.exit(0);
            }
        }
    }
}
