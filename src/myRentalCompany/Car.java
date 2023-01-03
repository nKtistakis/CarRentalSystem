
package myRentalCompany;


public class Car {
    
    private String name;
    private String fuelType;
    private int storageSpace;
    private int horsePower;
    private int tireSize;
    private int engineCapacity;
    private double cost;
    private int seats;
    private int doors;
    
    
    public Car(String name){
       this.name=name;
       myCar();
    }
    
    public void setName(String name){
        this.name= name;
    }
    
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public void setHorsePower(int horsepower) {
        this.horsePower = horsepower;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setEngineCapacity(int engneCapacity) {
        this.engineCapacity = engneCapacity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
   
    public String getName(){
        return name;
    }
    
    public String getFuelType() {
        return fuelType;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getTireSize() {
        return tireSize;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public double getCost() {
        return cost;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }
    
    private void carParam(String ftype,int storespace,int horsep,int tsize,int ecap,double cost, int seats,int doors){
        setFuelType(ftype);
        setStorageSpace(storespace);
        setHorsePower(horsep);
        setTireSize(tsize);
        setEngineCapacity(ecap);
        setCost(cost);
        setSeats(seats);
        setDoors(doors);
    }
    
    public void myCar(){
        
        String car=getName();
        
        switch(car){
                case "Mitsubishi Evo":
                    carParam("Petrol",5,156,17,1499,3.5,5,4);
                    break;               
                case "BMW X6":
                    carParam("Petrol",3,89,15,1125,2.6,2,2);
                    break;
                case "Mercedes CLC":
                    carParam("Petrol",8,200,18,2600,4.7,7,4);
                    break;
        }
    }
    

    
    
    
    
}
