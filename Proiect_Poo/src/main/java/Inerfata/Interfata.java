package Inerfata;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interfata {
	JFrame frame = new JFrame("E_mersul_trenurilor");
	JPanel cadru = new JPanel();
	JPanel p1 = new Panou1(cadru);
	JPanel p2 = new Panou2(cadru);
        JPanel p3 = new Panou3(); 
	CardLayout cl = new CardLayout();

	public Interfata() throws Exception{
		cadru.setLayout(cl);             

		cadru.add(p1, "1");
		cadru.add(p2, "2");
                cadru.add(p3,"3");
		cl.show(cadru, "1");
                cadru.setPreferredSize(new Dimension(270,200));
                
		frame.add(cadru);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) throws Exception{
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
                            try {
                                new Interfata();
                            } catch (Exception ex) {
                                Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		});
	}

}
