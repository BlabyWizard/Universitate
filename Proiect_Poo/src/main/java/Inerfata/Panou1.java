package Inerfata;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panou1  extends JPanel{

    public Panou1(JPanel cadru) {
        
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("De la:");
        JTextField t1 = new JTextField(20);
        JLabel l2 = new JLabel("Pana la");
        JTextField t2 = new JTextField(20);
        JLabel l3 = new JLabel("Data de plecare");
        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox box1= new JComboBox(date);
        String luna[]={"Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie","Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};
	JComboBox box2= new JComboBox(luna);
        JButton buton1 = new JButton("Cauta");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(box1);
        add(box2);
        add(buton1);
        buton1.addActionListener(e->{
        if(t1.getText().isEmpty()||t2.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Nu s-au introdus date");
        }
        else{
        Manager m=Manager.getInstanta();
        m.setDestinati(t1.getText(), t2.getText());
        CardLayout cardLayout = (CardLayout) cadru.getLayout();
            cardLayout.show(cadru, "2");
        }
        
        });
    }
}
