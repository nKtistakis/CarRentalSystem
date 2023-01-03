
package myRentalCompany;

import static it21732.Menu.input;
import java.util.Date;
import java.util.Scanner;


public class UserData {

    private String name;
    private String driversNumber;
    private String idNumber;
    private int age;
    private String payment;
    private int creditNumber;


    public UserData(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriversNumber() {
        return driversNumber;
    }

    public void setDriversNumber(String driversNumber) {
        this.driversNumber = driversNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
    
    public int getCreditNumber(){
        return creditNumber; 
    }
    
    public void setCreditNumber(int creditNumber){
        this.creditNumber=creditNumber;
    }
    
    public void getUserData(String type){
       System.out.println("Now please provide us with your personal information:\n\n");
       Scanner sc = new Scanner(System.in);
       
       //NAME
       System.out.println("Enter your username");
       boolean bTest=false;
       while(bTest==false){
        String sTest=sc.nextLine();
        if(!sTest.startsWith(" ") && !sTest.equals("") ){
            setName(sTest);
            bTest=true;
        }else{
            System.out.println("Username cannot be blank");
        }
       }
       
       //ID NUMBER
        System.out.println("\nEnter your ID number");
        bTest=false;
        while(bTest==false){
        String sTest=sc.nextLine();
        if(!sTest.startsWith(" ") && !sTest.equals("") ){
            setIdNumber(sTest);
            bTest=true;
        }else{
            System.out.println("ID number, cannot be blank");
        }
       }
        
        //Drivers Number
       System.out.println("\nEnter your driver's licence number");
        bTest=false;
        while(bTest==false){
        String sTest=sc.nextLine();
        if(!sTest.startsWith(" ") && !sTest.equals("") ){
            setDriversNumber(sTest);
            bTest=true;
        }else{
            System.out.println("Driver's licence's number cannot be blank");
        }
       }
        
        //AGE
       System.out.println("Enter your age"); 
       setAge(input("Age has to be a number"));
       
       //PAYMENT
       if(type=="Store"){
           System.out.println("Choose payment method:\n1.Cash\n2.Credit Card\n");
           if(input("Worng input.Please choose 1 or 2")==2){
               System.out.println("Please enter your credit card's number:");
               setPayment("Credit Card");
               setCreditNumber(input("Credit card number is invalid"));
           }else{
               setPayment("Cash");
               setCreditNumber(0);
           }
       }else{
           System.out.println("Since you'll pick your car up from a pickup point the only way you can pay is by card.\n"
                   + "Please enter your credit card's number:");
           setPayment("Credit Card");
           setCreditNumber(input("Credit card number is invalid"));
       }
      
}
    
    

}
