package carrentalsystem;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rent {
    
    private int id;
    private User user;
    private Car car;
    private LocalDateTime dateTime;
    private int hours;
    private double total;
    private String status;
    private DateTimeFormatt formatter = DateTimeFormatter.ofPattern("yyyy-dd--MM")



    
}
