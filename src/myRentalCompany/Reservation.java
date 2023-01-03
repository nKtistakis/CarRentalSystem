
package myRentalCompany;

import java.security.SecureRandom;
import java.util.Date;


public class Reservation {

    private Car car;
    private Motorcycle motor;
    private Date pickupDate;
    private Date returnDate;
    private Store store;
    private UserData data;
    private double cost;
    private String code;

    //TEST MUST REMOVE!
    public Reservation(Car car){
        this.car=car;
    }
    //TEST 
    public Reservation(){
        
    }
    
    
    public Reservation(Car car, Store store, Date pickupDate, Date returnDate, UserData data) {
        this.car = car;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.store = store;
        this.data = data;
        calculateCost();
        genCode();
    }
    
    public Reservation(Motorcycle motor, Store store, Date pickupDate, Date returnDate, UserData data) {
        this.motor = motor;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.store = store;
        this.data = data;
        calculateCost();
        genCode();
    }


    

    
    
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Motorcycle getMotor() {
        return motor;
    }

    public void setMotor(Motorcycle motor) {
        this.motor = motor;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public UserData getData() {
        return data;
    }

    public void setData(UserData data) {
        this.data = data;
    }
    
    public double getCost(){
        return cost;
    }
    
    public void setCost(double cost){
        this.cost=cost;
    }
    
    public String getCode(){
        return code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public void calculateCost(){
        long diff = getReturnDate().getTime() - getPickupDate().getTime();
        int diffhours = (int) (diff / (60 * 60 * 1000));
        double cost = diffhours * getCar().getCost();
        if(getCar().getDoors()!=0){
            setCost(diffhours * getCar().getCost());
        }else{
            setCost(diffhours * getMotor().getCost());
        }
   
    }
    
    public void genCode(){
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(10000);
        String formatted = String.format("%05d", num); 
        setCode(formatted);
    }
    
    public void printRes(){
        String card="N/A";
        
        if(getData().getCreditNumber()!=-1){
            card=Integer.toString(getData().getCreditNumber());
        }
        
        System.out.printf("----Reservation : %s----\n\n-User info-"
                + "\nUsername: %s\nID Number: %s\nDriver's License number: %s\nAge: %d\nPayment Method: %s\nCredit Card: %s\n\n",
                getCode(),getData().getName(),getData().getIdNumber(),getData().getDriversNumber(),getData().getAge(),getData().getPayment(),card);
        
        System.out.println("-Vehicle-\n");
        if(getCar().getDoors()!=0){
            Menu.printCar(getCar().getName());
        }else{
            Menu.printMotor(getMotor().getName());
        }
        
        System.out.println("The vehicle has been booked from " + getPickupDate() + " until " + getReturnDate() +
                "\n\nTotal cost is: %l$" + getCost() + 
                "\n\nThe vechicle's store/deleviry point is:"  );
        
    }    
}
