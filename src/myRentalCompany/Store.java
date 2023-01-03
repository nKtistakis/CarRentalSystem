
package myRentalCompany;


public class Store {
    
    private int ID;
    private String type;
    private String address;

     public Store(int ID){
       this.ID=ID;
       myStore();
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    private void setStore(int ID, String type, String Address){
        setID(ID);
        setType(type);
        setAddress(Address);
    }
    
    public void myStore(){
        switch(getID()){
            case 1:
                setStore(ID,"Store\t","Antheon 32,TK23456");
                break;
            case 2:
                setStore(ID,"Store\t","Socratus 58,TK13426");
                break;
            case 3:
                setStore(ID,"Pickup Point\t","Papadiamantopoulou 20,TK23872");
                break;
            case 4:
                setStore(ID,"Pickup Point\t","Papagu 3,TK33421");
                break;
        }
    }
    
}
