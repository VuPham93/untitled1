import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main2  extends JFrame {
    public Main2(){
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300,300);

        JLabel myLabel = new JLabel("User:");
        JTextField myText=new JTextField(15);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                callMainFrame();
            }
        });

        getContentPane().add(myLabel);
        getContentPane().add(myText);


    }

    private void callMainFrame() {
        Main myMain=new Main();
        myMain.setVisible(true);
    }
}
