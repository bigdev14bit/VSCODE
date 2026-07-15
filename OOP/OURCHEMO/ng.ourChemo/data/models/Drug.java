import java.time.LocalDateTime;

public class Drug {
    private int ID;
    private String name;
    private String brand;
    private int price;
    private LocalDateTime expiryDate;

    public Drug(int ID, String name, String brand, int price) {
        this.ID = ID;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.expiryDate = LocalDateTime.now();
    } 
}
