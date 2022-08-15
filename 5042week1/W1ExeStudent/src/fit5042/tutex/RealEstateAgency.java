package fit5042.tutex;

import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.PropertyRepositoryFactory;
import fit5042.tutex.repository.entities.Property;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * TODO Exercise 1.3 Step 3 Complete this class. Please refer to tutorial instructions.
 * This is the main driver class. This class contains the main method for Exercise 1A
 * 
 * This program can run without the completion of Exercise 1B.
 * 
 * @author Junyang
 */
public class RealEstateAgency {
    private String name;
    private final PropertyRepository propertyRepository;

    public RealEstateAgency(String name) throws Exception {
        this.name = name;
        this.propertyRepository = PropertyRepositoryFactory.getInstance();
    }
    
    public void createProperty() {
        try {
            this.propertyRepository.addProperty(new Property(1, "22 Yue Jiang, Yan Cheng 10, China", 2, 150, new BigDecimal("420000")));
            this.propertyRepository.addProperty(new Property(2, "17 Nancy Mei, Su Zhou 20, China", 3, 352, new BigDecimal("360000")));
            this.propertyRepository.addProperty(new Property(3, "13 Mike Guan, Nan Jing 30, America", 5, 800, new BigDecimal("650000")));
            this.propertyRepository.addProperty(new Property(4, "16 Andy Zhou, Shang Hai 40, Australia", 2, 170, new BigDecimal("435000")));
            this.propertyRepository.addProperty(new Property(5, "23 Linke Mou, Chang Zhou 50, England", 1, 60, new BigDecimal("820000")));
            System.out.println("5 properties added successfully");
        } catch (Exception ex) {
            System.out.println("Insertion failure");
        }
    }
    
    public void displayProperties() {
        try {
            List<Property> properties = propertyRepository.getAllProperties();
            for (Property property : properties) {
                System.out.println(property.toString());
            }
        } catch (Exception ex) {
            System.out.println("The data in property list is empty.");
        }
    }
    
    public void searchPropertyById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the property you want to search: ");
        try {
            int input = scanner.nextInt();
            Property property = this.propertyRepository.searchPropertyById(input);
            if (property != null) {
                System.out.println(property.toString());
            } else {
                System.out.println("Property does not exist.");
            }
        } catch (Exception ex) {
            System.out.println("Please input an Integer: " + ex.getMessage());
        }
    }
    
    public void run() {
        createProperty();
        System.out.println("********************************************************************************");
        displayProperties();
        System.out.println("********************************************************************************");
        searchPropertyById();
    }
    
    public static void main(String[] args) {
        try {
            new RealEstateAgency("FIT5042 Real Estate Agency").run();
        } catch (Exception ex) {
            System.out.println("Application fail to run: " + ex.getMessage());
        }
    }
}
