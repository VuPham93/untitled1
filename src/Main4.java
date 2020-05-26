import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main4 extends JFrame{
   public Main4() {
    //3 layout : flowLayout, borderLayout, gridlayout
       super("Main4");
        setLayout(new BorderLayout(5,5));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setLocation(200,200);
        Image img= Toolkit.getDefaultToolkit().getImage("Icon.png");
        setIconImage(img);
        //Label khac Panel
        JPanel topPanel=new JPanel(new FlowLayout(5,20,20));
         JButton btn1= new JButton("btn1");
        btn1.setPreferredSize(new Dimension(100,40));
        topPanel.add(btn1);
        topPanel.add(new JButton("btn2"));
        topPanel.add(new JButton("btn3"));
        topPanel.add(new JButton("btn4"));
        topPanel.setBackground(new Color(110, 110, 255));

       JPanel bottomPanel=new JPanel(new FlowLayout(5,20,20));
       bottomPanel.add(new JButton("btn2"));
       bottomPanel.add(new JButton("btn3"));
       bottomPanel.add(new JButton("btn4"));
       bottomPanel.setBackground(new Color(176, 255, 167));

       JPanel westPanel=new JPanel(new GridLayout(4,1,5,5));
       JButton westBtn2= new JButton("Btn2 West");
       westPanel.add(westBtn2);
       westPanel.add(new JButton("btn3"));
       westPanel.add(new JButton("btn4"));
       westPanel.add(new JButton("btn5"));

       westPanel.setBackground(new Color(255, 235, 139));

       JPanel centerPanel= new JPanel(new FlowLayout());
       JPanel nestPanel=new JPanel();
       JLabel myLabel= new JLabel("Nest Panel",JLabel.CENTER);
       nestPanel.add(myLabel);
       centerPanel.add(nestPanel);


       westBtn2.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               setVisible(false);
               Main4 main4=new Main4();
               main4.setVisible(true);
           }
       });

       getContentPane().add(topPanel,BorderLayout.NORTH);
       getContentPane().add(bottomPanel,BorderLayout.SOUTH);
       getContentPane().add(westPanel,BorderLayout.WEST);
       getContentPane().add(centerPanel,BorderLayout.CENTER);



    }

    public static void main(String[] args) {
        Main4 myMain=new Main4();
        myMain.setVisible(true);
    }
}
