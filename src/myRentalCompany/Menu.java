 
package myRentalCompany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    

   public static void printMotor(String name){
        Motorcycle c = new Motorcycle(name);
        System.out.printf("-%s-\n\tHorsepower: %d\n\tTire size: %d\n\tEngine capacity: %d\n\tFuel Type: %s\n\t"
                + "Hourly Cost: %f$\n\n",c.getName(),c.getHorsePower(),
                c.getTireSize(),c.getEngineCapacity(),c.getFuelType(),c.getCost());
   
    }
   
   private void motorList(){
       Motorcycle Ducati = new Motorcycle("Ducati Scrambler");  
       System.out.print("1.\t");printMotor(Ducati.getName());
       Motorcycle Harley = new Motorcycle("Harley-Davidson Low Rider");  
       System.out.print("2.\t");printMotor(Harley.getName());
       Motorcycle Indian = new Motorcycle("Indian Scout");  
       System.out.print("3.\t");printMotor(Indian.getName());
       Motorcycle DucatiMon = new Motorcycle("Ducati Monster 821");  
       System.out.print("4.\t");printMotor(DucatiMon.getName());
       Motorcycle Yamaha = new Motorcycle("Yamaha FZ-07");  
       System.out.print("5.\t");printMotor(Yamaha.getName());
       } 
    
   public static void printCar(String name){
        Car c = new Car(name);
        System.out.printf("-%s-\n\tStorage space: %d\n\tHorsepower: %d\n\tTire size: %d\n\tEngine capacity: %d\n\t"
                + "Fuel Type %s\n\tHourly Cost: %f$\n\tAvailable seating: %d\n\tDoors: %d\n\n",c.getName(),c.getStorageSpace(),
                c.getHorsePower(),c.getTireSize(),c.getEngineCapacity(),c.getFuelType(),c.getCost(),c.getSeats(),c.getDoors());
   }
    
   private void carList(){
       Car mitsubishi = new Car("Mitsubishi Evo");  
       System.out.print("1.\t");printCar(mitsubishi.getName());
       Car bmw = new Car("BMW X6");
       System.out.print("2.\t");printCar(bmw.getName());
       Car mercedes = new Car("Mercedes CLC");
       System.out.print("3.\t");printCar(mercedes.getName());
   } 
   
   private void printStore(){
       Store s1 = new Store(1);
       Store s2 = new Store(2);
       Store s3 = new Store(3);
       Store s4 = new Store(4);
       System.out.printf("1.%s %s\n\n2.%s %s\n\n3.%s %s \n\n4.%s %s\n",s1.getType(),s1.getAddress(),s2.getType(),s2.getAddress(),
       s3.getType(),s3.getAddress(),s4.getType(),s4.getAddress());
   }
   
   //prepei na ginei anazitisi mesa sti lista meso code
   
   public void getReservation(/*ArrayList <Reservation> resList,String code*/){
       ArrayList <Reservation> resList = new ArrayList<>();
       Reservation reservation=resList.get(0);
       reservation.printRes();
   }
   
   public void printReservations(/*ArrayList <Reservation> resList*/){
       ArrayList <Reservation> resList = new ArrayList<>();
       
       Car car = new Car("BMW X6");
       car.myCar();
       Car car2 = new Car("Mitsubishi Evo");
       Reservation res1=new Reservation(car);
       Reservation reservation=null;
       int i=0;
       while(i<=resList.size()){
           reservation=resList.get(i);
           
           i++;
       }
       
       
   }

   public static int input(String msg){
         int a=0;
         Scanner sc = new Scanner(System.in);
         boolean c=false;
         while (c==false){
             if(sc.hasNextInt()){
                 a=sc.nextInt();
                 c=true;
             }else{
                 System.out.println(msg);
                 sc.next();
             }
         }

         return a;

   }
   
   public static Date date(){
        Scanner sc = new Scanner(System.in);
        String date ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date2= null;
        Date cDate= new Date();
        boolean b=true;
        while(b==true){
            date=sc.nextLine();
         try {
             date2 = dateFormat.parse(date);
             if(cDate.before(date2)){
             System.out.println("Is this the correct time?\n"+ date2 +"\n\n1.Yes\n2.No\n");
             if(input("Wrong input. Please choose 1 or 2")==1){
                b=false;
             }else{
                System.out.println("Ok, please enter a new date in - DD/MM/YYYY HH:MM - format");    
                }
             }else{
                 System.out.println("You have to choose a date after the current system time.\n"
                         + "Please enter a new date in - DD/MM/YYYY HH:MM - format");  
             }
         } catch (Exception e) {
             System.out.println("Something went worng, please use - DD/MM/YYYY HH:MM - format");
         }
                
                
        }
       return date2;
    }
   
   public Reservation defRes1(){
       Car car = new Car("BWM X6");
       car.myCar();
       Store store = new Store(1);
       String pDate = "2/27/2020 9:40";
       String rDate = "3/6/2020 18:30";
       Date pickupDate = new Date("2/25/2020 16:45");
       Date returnDate = new Date("2/25/2020 17:45");
       UserData data = new UserData();
       data.setName("Giorgos Nikolaou");data.setDriversNumber("532a2398");data.setIdNumber("32724a");
       data.setCreditNumber(456843);data.setAge(37);data.setPayment("Cash");
       Reservation res = new Reservation(car,store,pickupDate,returnDate,data);
       return res;
   }
   
   private Reservation defRes2(){
       Motorcycle motor = new Motorcycle("Yamaha FZ-07");
       motor.myMotor();
       Store store = new Store(4);
       Date pickupDate = new Date("11/31/2020 6:45");
       Date returnDate = new Date("1/25/2021 22:17");
       UserData data = new UserData();
       data.setName("Manthos Foustanos");data.setDriversNumber("86721fv2");data.setIdNumber("B49wE2");
       data.setCreditNumber(906530);data.setAge(32);data.setPayment("Credit Card");
       Reservation res = new Reservation(motor,store,pickupDate,returnDate,data);
       return res;
               
   }
   
   private Reservation defRes3(){
       
   }
   
   public void printMenu(){
    System.out.println("Welcome to JAVIS rent a motor! Below you can see our main menu, Please chooce an option!\n");
       
    ArrayList <Reservation> resList = new ArrayList<>();
       
    boolean exitProgramm = false;
    while(exitProgramm==false){
           System.out.println("\t\t--MAIN MENU--\n\n\n"
               + "\t1.Vehicle Reservation\n"
               + "\t2.Manage your Reservation\n"
               + "\t3.Show Reservations\n"
               + "\t4.Exit\n");
        
        switch(input("Wrong input. Please choose between 1,2,3 or 4")){//Main menu
            default:
               System.out.println("Wrong input. Please choose between 1,2,3 or 4");
               break;
            case 1://Vehicle Reservation
                
               boolean exitReservation=true;
               while(exitReservation==true){
               System.out.println("Please choose your desired vehicle type:\n\n1.Car\n2.Motorcycle");
               
               
               //Variables
                Store store = null;
                Date pickupDate = null;
                Date returnDate =null;
                UserData data = new UserData();
                boolean wrong = true;
                Reservation reservation = null;
               //Variables
                
               switch(input("Wrong input. Please choose between 1 or 2")){
                   
                   case 1://Car Selection
                       System.out.println("Now pick a car from our list below");
                       carList();
                       Car car=null;
                       
                       while(wrong==true){
                       switch(input("Wrong input. Please choose between 1, 2 or 3\n")){//Car Model Selection
                           case 1://Mitsubishi
                               car = new Car("Mitsubishi Evo");
                               System.out.println("Confirmed choise of \n");
                               printCar("Mitsubishi Evo");
                               wrong=false;
                               break;
                               
                           case 2://BMW
                               car = new Car("BMW X6");
                               System.out.println("Confirmed choise of \n");
                               printCar("BMW X6");
                               wrong=false;
                               break;
                               
                           case 3://Mercedes 
                               car = new Car("Mercedes CLC");
                               System.out.println("Confirmed choise of \n");
                               printCar("Mercedes CLC");
                               wrong=false;
                               break;
                               
                           default:
                               System.out.println("Wrong input. Please choose between 1, 2 or 3\n");
                               break;
                       }
                       }
                       //Car Selected
                       System.out.println("Next choose one of the aprooved locations below, to pickup your vehicle from.\n");
                       printStore();
                       
                       
                        //Store Selection
                        wrong=true;
                        while(wrong==true){
                        switch(input("Wrong input. Please choose between 1, 2, 3 or 4\n")){//Store Selection(car)
                            case 1:
                                store = new Store(1);
                                wrong=false;
                                break;
                            case 2:
                                store = new Store(2);
                                wrong=false;
                                break;
                            case 3:
                                store = new Store(3);
                                wrong=false;
                                break;
                            case 4:
                                store = new Store(4);
                                wrong=false;
                                break;
                            default:
                                System.out.println("Wrong input. Please choose between 1, 2, 3 or 4\n");
                                break;
                        }
                        }
                       //Store Selected
                        
                       //Date Selection 
                       wrong = true;
                       while(wrong==true){ 
                            System.out.println("Please enter a date for pickup in - DD/MM/YYYY HH:MM - format\n");
                            pickupDate=date();
                            System.out.println("And now enter the drop-off date in - DD/MM/YYYY HH:MM - format\n");                       
                            returnDate=date();
                            if(pickupDate.after(returnDate) || pickupDate.equals(returnDate)){
                                System.out.println("Return date has to be after pickup date. Please renter the dates");
                            }else{
                                wrong=false;
                            }

                       }
                        //Dates Selected 
                       
                        //User Data entering
                        data.getUserData(store.getType());
                        //User Data entered 
                        
                        //Reservation
                        reservation = new Reservation(car,store,pickupDate,returnDate,data);
                        resList.add(reservation);
                        System.out.println(resList);
                        //Reservation Stored
                        System.out.println("Reservation completed");
                        
                       exitReservation=false;
                       break;
                       
                   case 2://Motorcyle
                       System.out.println("Now pick a motorcyle from our list below");
                       motorList();
                       Motorcycle motor=null;
                       
                       wrong=true;
                       while(wrong==true){
                        switch(input("Wrong input. Please choose between 1, 2, 3, 4 or 5\n")){
                            case 1:
                               motor = new Motorcycle("Ducati Scrambler");
                               System.out.println("Confirmed choise of \n");
                               printMotor("Mitsubishi Evo");
                               wrong=false;
                               break;
                               
                            case 2:
                               motor = new Motorcycle("Harley-Davidson Low Rider");
                               System.out.println("Confirmed choise of \n");
                               printMotor("Mitsubishi Evo");
                               wrong=false;
                               break;
                               
                            case 3:
                               motor = new Motorcycle("Indian Scout");
                               System.out.println("Confirmed choise of \n");
                               printMotor("Mitsubishi Evo");
                               wrong=false;
                               break;
                               
                            case 4:
                               motor = new Motorcycle("Ducati Monster 821");
                               System.out.println("Confirmed choise of \n");
                               printMotor("Mitsubishi Evo");
                               wrong=false;
                               break;
                               
                            case 5:    
                               motor = new Motorcycle("Yamaha FZ-07");
                               System.out.println("Confirmed choise of \n");
                               printMotor("Mitsubishi Evo");
                               wrong=false;
                               break;
                               
                            default:
                                System.out.println("Wrong input. Please choose between 1, 2, 3, 4 or 5\n");
                                break;
                        }
                       }
                       System.out.println("Next choose one of the aprooved locations below, to pickup your vehicle from.\n");
                       printStore();
                       
                       
                        //Store Selection
                        wrong=true;
                        while(wrong==true){
                        switch(input("Wrong input. Please choose between 1, 2, 3 or 4\n")){//Store Selection(car)
                            case 1:
                                store = new Store(1);
                                wrong=false;
                                break;
                            case 2:
                                store = new Store(2);
                                wrong=false;
                                break;
                            case 3:
                                store = new Store(3);
                                wrong=false;
                                break;
                            case 4:
                                store = new Store(4);
                                wrong=false;
                                break;
                            default:
                                System.out.println("Wrong input. Please choose between 1, 2, 3 or 4\n");
                                break;
                        }
                        }
                       //Store Selected
                        
                       //Date Selection 
                       wrong = true;
                       while(wrong==true){ 
                            System.out.println("Please enter a date for pickup in - DD/MM/YYYY HH:MM - format\n");
                            pickupDate=date();
                            System.out.println("And now enter the drop-off date in - DD/MM/YYYY HH:MM - format\n");                       
                            returnDate=date();
                            if(pickupDate.after(returnDate) || pickupDate.equals(returnDate)){
                                System.out.println("Return date has to be after pickup date. Please renter the dates");
                            }else{
                                wrong=false;
                            }

                       }
                        //Dates Selected 
                       
                        //User Data entering
                        data.getUserData(store.getType());
                        //User Data entered 
                        
                        //Reservation
                        reservation = new Reservation(motor,store,pickupDate,returnDate,data);
                        resList.add(reservation);
                        System.out.println(resList);
                        //Reservation Stored
                       
                       exitReservation=false;
                       break;
               }
               

               break;
               }
//---------------------------------------------------------------------------------------------------------------------------//
           case 2://Booking managment
               
               
               break;
//---------------------------------------------------------------------------------------------------------------------------//
           case 3://Show bookings
               
               
               break;
//---------------------------------------------------------------------------------------------------------------------------//
           case 4://Exit
               exitProgramm=true;
               System.out.println("Thank you for choosing Javis rent-a-motor! Have a good day.");
               break;

       } 
       }
   
       
   }
}

