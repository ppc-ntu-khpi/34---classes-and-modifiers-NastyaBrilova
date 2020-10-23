
public class testCustomers {
   
    public static void main(String args[]){
        Customers d = new Customers();
        d.displayCustomersInfo();
        d.setID(65);
        System.out.println("ID customers: " + d.getID());
        
        d.setIsNew(true);
        System.out.println("Is it new customer: " + d.isIsNew());
        
        d.setTotal(264);
        System.out.println("Total purchases are: " + d.getTotal());  
    }
}
