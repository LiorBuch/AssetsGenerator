import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private static String mainJarLocation = AssetsGenerator.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    private String type;

    public void write() {
            try {
                FileWriter myWriter = new FileWriter(mainJarLocation+"savefile/PathSave.txt");
                myWriter.write("");
                myWriter.write("entity.evolving_matter.fiend": "Fiend",);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        public void getType(String[] strings){

        }
}
