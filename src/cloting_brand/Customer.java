
package cloting_brand;

public class Customer extends User {
    private Shop shop;
    private Cart cart;

    public Customer(String username, String password, String role)
    {
        super(username, password, role);
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void sendMessage(String messageContent, User recipient) {
        // Implement message sending for Customer
    }

    public void viewLatestNews() {
        // Implement viewing latest news for Customer
    }

    // Additional methods specific to Customer class
}

