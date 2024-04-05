import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {
    public static void main(String[] args) {
        try {
            generateFiles();
            System.out.println("Archivos generados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al generar archivos: " + e.getMessage());
        }
    }

    private static void generateFiles() throws IOException {
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            String fileName = "file" + i + ".txt";
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            for (int j = 0; j < 10; j++) {
                writer.write(random.nextInt(100) + "\n");
            }
            writer.close();
        }
    }
}


