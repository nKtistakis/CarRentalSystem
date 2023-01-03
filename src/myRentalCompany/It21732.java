
package myRentalCompany;

import static it21732.Menu.date;
import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class It21732 {

  
    public static void main(String[] args) {
        Car car = new Car("BMW X6");
        Menu menu = new Menu();
        System.out.println(car.getDoors());
        Reservation res = menu.defRes1();
        //res.printRes();
        
        //menu.printMenu();
        //UserData data = new UserData();
        //Menu.getUserData("",data);
        //System.out.printf("%d", menu.input());
        //menu.printReservation();
        //Reservation res=null;
//       res.printRes();
       
       
    }
    
}