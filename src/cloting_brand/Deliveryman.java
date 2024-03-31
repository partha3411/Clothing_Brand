package cloting_brand;

public class Deliveryman extends User {

    private final String employeeID;
    private final String department;

    public Deliveryman(String username, String password, String role, String employeeID, String department) {
        super(username, password, role);
        this.employeeID = employeeID;
        this.department = department;
    }

    @Override
    public void sendMessage(String messageContent, User recipient) {
        
    }

    @Override
    public void viewLatestNews() {
       
    }
}
