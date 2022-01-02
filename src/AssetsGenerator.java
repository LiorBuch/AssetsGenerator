import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AssetsGenerator implements ActionListener {
    protected static String PATH,NAME;
    private final JTextField inputObjectName, inputPathText;
    private final JButton setObjectNameButton, setPathOfFileButton, getOrCreateNewSaveFileButton,writeToFile;
    private final JComboBox<String> setObjType;
    private final FileManager fileManager;

    public static void main(String[] args) {
        new AssetsGenerator();
    }

    public AssetsGenerator(){
        JFrame mainFrame = new JFrame("Generator");
        this.fileManager = new FileManager();

        mainFrame.setSize(800,800);
        String[] typesArray = {"Lang","Simple Item Model","Default BlockState","Simple BlockModel","Entity"};

        //Buttons
        this.setObjectNameButton = new JButton("Object name");
        setObjectNameButton.setBounds(10,10,150,30);
        setObjectNameButton.addActionListener(this);
        this.setPathOfFileButton = new JButton("Path");
        setPathOfFileButton.setBounds(10,50,150,30);
        setPathOfFileButton.addActionListener(this);
        this.getOrCreateNewSaveFileButton = new JButton("Load Save");
        getOrCreateNewSaveFileButton.setBounds(620,10,120,30);
        getOrCreateNewSaveFileButton.addActionListener(this);
        this.setObjType = new JComboBox(typesArray);
        setObjType.setBounds(500,10,100,30);
        setObjType.addActionListener(this);
        this.writeToFile = new JButton("Write");
        writeToFile.setBounds(600,600,50,50);
        writeToFile.addActionListener(this);


        //TextFields
        this.inputObjectName = new JFormattedTextField("put the object name as referred in the register");
        inputObjectName.setBounds(170,10,300,30);
        this.inputPathText = new JFormattedTextField("put file Path here");
        inputPathText.setBounds(170,50,300,30);

        mainFrame.setVisible(true);
        mainFrame.setLayout(null);
        //Add Buttons
        mainFrame.add(setObjectNameButton);
        mainFrame.add(setPathOfFileButton);
        mainFrame.add(getOrCreateNewSaveFileButton);
        mainFrame.add(setObjType);
        mainFrame.add(writeToFile);
        //Add Texts
        mainFrame.add(inputObjectName);
        mainFrame.add(inputPathText);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== setObjectNameButton){
            NAME= inputObjectName.getText();
        }
        if (e.getSource()==setPathOfFileButton){
            PATH = inputPathText.getText();
        }
        if (e.getSource()==writeToFile){
            fileManager.getType();
        }

    }
}
