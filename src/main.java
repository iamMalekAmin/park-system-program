
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Garage garage = new Garage();
        garage.setTotalslots(10);
        Admin admin = new Admin("malek", 1, garage);
        garage.setAdmin(admin);
        Dimensions slot1 = new Dimensions(10, 10, 1);
        Dimensions slot2 = new Dimensions(100, 100, 2);
        User user1 = new User("user1", 1, new parking(new Vehicle("car1", 1, 2019, 1010, 100)));
        User user2 = new User("user2", 2, new parking(new Vehicle("car2", 2, 2019, 10, 10)));
        garage.AddAvilableslots((IDimensions) slot1);
        garage.AddAvilableslots((IDimensions) slot2);
        user2.park.parkin(garage);
        admin.printSlots();
        user1.park.parkin(garage);
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        user1.park.parkOut(garage);
        user2.park.parkOut(garage);
        admin.printTotalincome();
        System.out.println("Done");
    }
}
