package myRentalCompany;


public class Motorcycle {
    
    private String name;
    private String fuelType;
    private int horsePower;
    private int tireSize;
    private int engineCapacity;
    private double cost;

    public Motorcycle(String name){
        this.name=name;
        myMotor();
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public String getName() {
        return name;
    }

    public String getFuelType() {
        return fuelType;
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

     private void motorParam(String ftype,int horsep,int tsize,int ecap,double cost){
        setFuelType(ftype);
        setHorsePower(horsep);
        setTireSize(tsize);
        setEngineCapacity(ecap);
        setCost(cost);
    }
     
    public void myMotor(){
        
        String motor=getName();
        
        switch(motor){
                case "Ducati Scrambler":
                    motorParam("Petrol",105,15,998,3.1);
                    break;               
                case "Harley-Davidson Low Rider":
                    motorParam("Electric",147,15,982,2.4);
                    break;
                case "Indian Scout":
                    motorParam("Petrol",55,14,115,1.4);
                    break;
                case "Ducati Monster 821":
                    motorParam("Petrol",85,16,478,2.9);
                    break;
                case "Yamaha FZ-07":
                    motorParam("Electric",180,14,950,2.8);
                    break;
        }
        
                    
     
    } 
   
    
    
    
    
    
}
