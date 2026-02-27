class User{
    String name;
    void showUser(){
        System.out.println("User name: "+name);
    }
}
class Customer extends User{
    void makePayment(double amount){
        System.out.println("Customer Paid: "+amount);
    }
}
class PremiumCustomer extends Customer{
    @Override
    void makePayment(double amount) { // we are overriding this
       double discount = amount*10/100;
       double finalAmount = amount-discount;
       System.out.println("Premium customer payment");
       System.out.println("Original Amount: "+amount);
       System.out.println("Discount 10%" + discount);
       System.out.println("Final Amount Paid: "+finalAmount);
    }
}
class DeliveryPartner extends User{
    void receiveIncentive(double incentive){
        System.out.println("delivery partner receive: " +incentive);
    }
}
public class food {

    public static void main(String[] args) {
        System.out.println("=====Normal User=====");
        Customer c1 = new Customer();
        c1.name ="taylor";
        c1.showUser();
        c1.makePayment(1000);
        System.out.println("=====Premium User======");
        Customer c2 = new PremiumCustomer();
        c2.name ="harry";
        c2.showUser();
        c2.makePayment(5000);
        System.out.println("=====Delivery partner====");
        DeliveryPartner d1 = new DeliveryPartner();
        d1.name ="taylor2";
        d1.showUser();
        d1.receiveIncentive(100);
    }
    
}
