import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame{
    public Main(){

        super("Vu Frame");
        setLayout(new FlowLayout());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(200,200);
        Image img= Toolkit.getDefaultToolkit().getImage("Icon.png");
        setIconImage(img);

        JButton btn=new JButton("Login");
        JButton btn1=new JButton("Login1");
        JButton btn2=new JButton("Login2");
        JButton btn3=new JButton("Login3");
        JButton btn4=new JButton("Login4");
        JButton btn5=new JButton("Login5");

        Container container= getContentPane();
        getRootPane().setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.RED));
        container.setBackground(Color.CYAN);

        btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                Main2 myFrameLogin=new Main2();
                myFrameLogin.setVisible(true);
                setVisible(false);
            }
        });

        container.add(btn);
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(btn4);
        container.add(btn5);



    }

    public static void main(String[] args) {
        Main myMainFrame= new Main();
        myMainFrame.setVisible(true);
    }

}
