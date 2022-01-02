import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileManager {

    private String type;


    public void getType(String type) {
        this.type = type;
    }

    public void buildSimpleItemModel() {

    }
    public void readFromPathFile(){
        String filePath = AssetsGenerator.mainJarLocation + "savefile/PathSave.txt";
        File file = new File(filePath);
        try {
            Scanner sc = new Scanner(file);
            String pathCheck = sc.nextLine();
            System.out.println(pathCheck);
            if (pathCheck.equals("modpath:")){
                AssetsGenerator.CONSOLE.setText("NO ASSETS PATH WAS FOUND");
            }else {
                AssetsGenerator.CONSOLE.setText("FOUND A SAVE");
                AssetsGenerator.PATH=pathCheck;
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeInFile(String filePath,String whatToWrite){
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(whatToWrite);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
