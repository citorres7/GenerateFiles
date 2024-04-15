import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateInfoFiles {
    public static void main(String[] args) {
        try {
            // create files
            createSalesMenFile(10, "SalesmanInfo.txt");
            createProductsFile(20, "ProductsInfo.txt");

            System.out.println("Files generated successfully.");
        } catch (IOException e) {
            System.err.println("Error generating files: " + e.getMessage());
        }
    }

    // Method to generate random seller information files.
    private static void createSalesMenFile(int salesmanCount, String fileName) throws IOException {
        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < salesmanCount; i++) {
                String tipeDocument = "Tipe" + (random.nextInt(10) + 1);
                String numberDocument = "Number" + (random.nextInt(1000) + 1);
                writer.println(tipeDocument + ";" + numberDocument);
                for (int j = 0; j < 3; j++) {
                    String productId = "IdProduct" + (random.nextInt(20) + 1);
                    int amount = random.nextInt(10) + 1;
                    writer.println(productId + ";" + amount);
                }
            }
        }
    }

    // method to generate random product information file
    private static void createProductsFile(int productCount, String fileName) throws IOException {
        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < productCount; i++) {
                String productId = "IdProduct" + (random.nextInt(20) + 1);
                String productName = "ProductName" + (random.nextInt(100) + 1);
                double price = random.nextDouble() * 100; // precio aleatorio entre 0 y 100
                writer.println(productId + ";" + productName + ";" + price);
            }
        }
    }
}

