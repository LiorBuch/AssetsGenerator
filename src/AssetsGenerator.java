import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

public class AssetsGenerator implements ActionListener {
    protected static String PATH,NAME;
    private final JTextField inputObjectName, inputPathText;
    public static JTextField CONSOLE;
    private final JButton setPathOfFileButton, getOrCreateNewSaveFileButton,writeToFile;
    private final JComboBox<String> setObjType;
    private final FileManager fileManager;
    public static String mainJarLocation = AssetsGenerator.class.getProtectionDomain().getCodeSource().getLocation().getPath();

    public static void main(String[] args) {
        new AssetsGenerator();
    }

    public AssetsGenerator(){
        JFrame mainFrame = new JFrame("Generator");
        this.fileManager = new FileManager();

        mainFrame.setSize(800,800);
        String[] typesArray = {"Lang","Simple Item Model","Default BlockState","Simple BlockModel","Entity"};

        //Buttons
        this.setPathOfFileButton = new JButton("Create Path");
        setPathOfFileButton.setBounds(10,10,150,30);
        setPathOfFileButton.addActionListener(this);
        this.getOrCreateNewSaveFileButton = new JButton("Load Save");
        getOrCreateNewSaveFileButton.setBounds(520,10,120,30);
        getOrCreateNewSaveFileButton.addActionListener(this);
        this.setObjType = new JComboBox(typesArray);
        setObjType.setBounds(320,100,100,30);
        setObjType.addActionListener(this);
        this.writeToFile = new JButton("Write");
        writeToFile.setBounds(600,600,80,80);
        writeToFile.addActionListener(this);


        //TextFields
        this.inputObjectName = new JFormattedTextField("put the object name as referred in the register");
        inputObjectName.setBounds(10,100,300,30);
        this.inputPathText = new JFormattedTextField("Put Mod assets path here");
        inputPathText.setBounds(170,10,300,30);
        CONSOLE = new JTextField();
        CONSOLE.setBounds(100,500,400,100);

        mainFrame.setVisible(true);
        mainFrame.setLayout(null);
        //Add Buttons
        mainFrame.add(setPathOfFileButton);
        mainFrame.add(getOrCreateNewSaveFileButton);
        mainFrame.add(setObjType);
        mainFrame.add(writeToFile);
        //Add Texts
        mainFrame.add(inputObjectName);
        mainFrame.add(inputPathText);
        mainFrame.add(CONSOLE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==setPathOfFileButton){
            fileManager.writeInFile(mainJarLocation+"savefile/PathSave.txt",inputPathText.getText());
        }
        if (e.getSource()==writeToFile){
            fileManager.getType(setObjType.getSelectedItem().toString());
        }
        if (e.getSource()==getOrCreateNewSaveFileButton){
            fileManager.readFromPathFile();


        }

    }
}
