
public class Customers {

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
       this.ID = ID;
    }
    
    private boolean  isNew;  
    
    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    private float total;
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
      
   
    
    public void displayCustomersInfo() {
    
        System.out.println("Customer ID: " +ID);
        System.out.println("Is it new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
}
    public Customers(){
        ID = 77;
        isNew = true;
        total = 1054;
    }
    
}