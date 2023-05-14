package Inerfata;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panou3 extends JPanel {

    public Panou3() {
        setLayout(new FlowLayout());
        Manager2 M = Manager2.getInstanta();
        JLabel Nume_tren= new JLabel("Nume Tren:");
        JLabel nume_tren = new JLabel();
        JLabel Clasa = new JLabel("CLasa:");
        JLabel clasa = new JLabel();
        JLabel Tren = new JLabel("Tip de tren");
        JLabel tren = new JLabel();
        JLabel CNP = new JLabel("CNP:");
        JLabel cnp = new JLabel();
        JLabel Pret = new JLabel("Pret:");
        JLabel pret = new JLabel();
        add(Nume_tren);
        add(nume_tren);
        add(Clasa);
        add(clasa);
        add(Tren);
        add(tren);
        add(CNP);
        add(cnp);
        add(Pret);
        add(pret);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                Manager2 applicationManager = Manager2.getInstanta();
               nume_tren.setText(applicationManager.getTipbilet());
               clasa.setText(applicationManager.getClasa());
               tren.setText(applicationManager.getTren());
               cnp.setText(applicationManager.getCnp());
               pret.setText(applicationManager.getPret());
            }
        });
    }
        
}
