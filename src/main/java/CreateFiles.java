import java.io.FileWriter;
import java.io.IOException;

public class CreateFiles {


    public static void main(String[] args) {
        try {

            for (int i = 0; i < 205; i++) {
                FileWriter myWriter = new FileWriter("./TestFiles/tmp_file" + i);
                myWriter.write("Hello from this FS!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
