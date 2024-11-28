package overriding;

class TV {
    public void switchON() {
        System.out.println("TV is Switched ON");
    }
    
    public void changeChannel() {
        System.out.println("TV Channel is Changed");
    }
}

class SmartTV extends TV {
    @Override
    public void switchON() {
        System.out.println("Smart TV is Switched ON");
    }
    
    @Override
    public void changeChannel() {
        System.out.println("SmartTV Channel is Changed");
    }
    
    public void browse() {
        System.out.println("Smart TV Browsing");
    }
}

public class Overriding {
    public static void main(String[] args) {
        TV t = new SmartTV();  // Polymorphism: Parent class reference, Child class object
        
        t.switchON();           // Calls the overridden method in SmartTV
        t.changeChannel();      // Calls the overridden method in SmartTV
        
        // Cannot call t.browse() because the reference type is TV, 
        // and the method browse() is specific to SmartTV.
        
        // Uncomment the below line to call browse() if the reference is SmartTV
        // ((SmartTV)t).browse(); // Cast the reference to SmartTV to call browse()
    }
}
