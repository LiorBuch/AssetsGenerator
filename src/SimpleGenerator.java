import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGenerator implements ActionListener {
    protected static String PATH,NAME;
    private final JTextField inputObjectName, inputPathText;
    private final JButton setObjectNameButton, setPathOfFileButton, getOrCreateNewSaveFileButton;
    public static void main(String[] args) {
        new SimpleGenerator();
    }

    public SimpleGenerator(){
        JFrame mainFrame = new JFrame("Generator");
        mainFrame.setSize(800,800);

        //Buttons
        this.setObjectNameButton = new JButton("Object name");
        setObjectNameButton.setBounds(10,10,150,30);
        setObjectNameButton.addActionListener(this);
        this.setPathOfFileButton = new JButton("Path");
        setPathOfFileButton.setBounds(10,50,150,30);
        setPathOfFileButton.addActionListener(this);
        this.getOrCreateNewSaveFileButton = new JButton("Load Save");
        getOrCreateNewSaveFileButton.setBounds(500,10,100,30);
        getOrCreateNewSaveFileButton.addActionListener(this);

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

    }
}
