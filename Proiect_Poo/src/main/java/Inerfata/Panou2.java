package Inerfata;
import Main.Prelucrare_trenuri;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

 public class Panou2 extends JPanel{
    
    JTable tabel;
    Vector<String> header ;
    Vector<Vector<String>> dataVector;
    Prelucrare_trenuri T;
    double pret;
    public Panou2(JPanel cadru) throws Exception{
    setLayout(new FlowLayout());
           
    
     T=new Prelucrare_trenuri("C:\\Users\\adrian\\Desktop\\Sem1\\Student\\Proiect_Poo\\src\\main\\java\\Main\\Tren");
        dataVector = new Vector<Vector<String>>();
        
        header = new Vector<String>(2);
        
        TableModel model = new DefaultTableModel(dataVector, header);
        JTable table = new JTable(model);
        table.setPreferredSize(new Dimension(100,100));
        JScrollPane Pan=new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(800,100));
        add(Pan);
        setSize(100, 100);
        setVisible(true);
        JLabel l1= new JLabel("Tip de bilet");
        JLabel l2= new JLabel("Clasa");
        JLabel l3= new JLabel("Tip de tren");
        String clienti[]={"Selectati","Copil","Elev","Student","Adult","Soldat","Pensionar"};
        String clase[]={"Selectati","1","2"};
        String tren[]={"Trenul Dorit","Personal","Rapid","Intercity","Mixt"};
        JLabel lc=new JLabel("CNP");
        JTextField t1= new JTextField(13);
        JComboBox box1= new JComboBox(clienti);
        box1.setActionCommand("disable");
        JComboBox box2= new JComboBox(clase);
        JComboBox box3= new JComboBox(tren);
        add(l1);
        add(box1);
        add(l2);
        add(box2);
        add(l3);
        add(box3);
        add(lc);
        add(t1);
        lc.setEnabled(false);
        t1.setEnabled(false);
        box1.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.SELECTED)
             if((e.getItem().toString().equals("Student"))||(e.getItem().toString().equals("Elev"))||(e.getItem().toString().equals("Soldat"))||(e.getItem().toString().equals("Copil"))||(e.getItem().toString().equals("Pensionar"))){
                lc.setEnabled(true);
                t1.setEnabled(true);
                
                }
                else{
                if(e.getItem().toString().equals("Adult")){
                lc.setEnabled(false);
                t1.setEnabled(false);
                }
                }
            
        }
        });
       box3.addItemListener(new ItemListener(){
           String km;
            int Km ;
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.SELECTED){
            if(e.getItem().toString().equals("Personal")){
              for(int i = 0; i < table.getRowCount(); i++){
                for(int j = 0; j < table.getColumnCount(); j++){
          if(table.getValueAt(i, j).equals("Personal")){
              km=table.getValueAt(i, 6).toString();
              Km=Integer.parseInt(km);
              if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.3*2;
          } 
          else{
          if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("2")){
          pret=Km*0.2*2;
          }
          }
           if(table.getValueAt(i, j).equals("Personal")){
              km=(table.getValueAt(i, 6).toString());
              Km=Integer.parseInt(km);
              if(box1.getSelectedItem().toString().equals("Copil")&&box1.getSelectedItem().toString().equals("Elev")&&box1.getSelectedItem().toString().equals("Student")&&box1.getSelectedItem().toString().equals("Soldat")&&box1.getSelectedItem().toString().equals("Pensionar")&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.2*2;
          } 
          else{
          if(box1.getSelectedItem().toString().equals("Copil")&&box1.getSelectedItem().toString().equals("Elev")&&box1.getSelectedItem().toString().equals("Student")&&box1.getSelectedItem().toString().equals("Soldat")&&box1.getSelectedItem().toString().equals("Pensionar")&&box2.getSelectedItem().toString().equals("2")){
          pret=Km*0.1*2;
          }  
            }
                }
                
                }
                    }
            if(e.getItem().toString().equals("Rapid")){
              for(int i = 0; i < table.getRowCount(); i++){
                for(int j = 0; j < table.getColumnCount(); j++){
          if(table.getValueAt(i, j).equals("Rapid")){
              km=(table.getValueAt(i, 6).toString());
              Km=Integer.parseInt(km);
              if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.3*2;
          } 
          else{
          if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("2")){
          pret=Km*0.2*2;
          }
          }
           if(table.getValueAt(i, j).equals("Rapid")){
              km=(table.getValueAt(i, 6).toString());
              Km=Integer.parseInt(km);
              if((box1.getSelectedItem().toString().equals("Copil")||box1.getSelectedItem().toString().equals("Elev")||box1.getSelectedItem().toString().equals("Student")||box1.getSelectedItem().toString().equals("Soldat")||box1.getSelectedItem().toString().equals("Pensionar"))&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.2*2;
          } 
          else{
          if((box1.getSelectedItem().toString().equals("Copil")||box1.getSelectedItem().toString().equals("Elev")||box1.getSelectedItem().toString().equals("Student")||box1.getSelectedItem().toString().equals("Soldat")||box1.getSelectedItem().toString().equals("Pensionar"))&&box2.getSelectedItem().toString().equals("2")){
          pret=Km*0.1*2;
          }  
            }
                }
                
                }
                    }
            if(e.getItem().toString().equals("Intercity")){
              for(int i = 0; i < table.getRowCount(); i++){
                for(int j = 0; j < table.getColumnCount(); j++){
          if(table.getValueAt(i, j).equals("Intercity")){
              km=(table.getValueAt(i, 6).toString());
              Km=Integer.parseInt(km);
              if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.3*2;
          } 
          else{
          if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("2")){
          pret=Km*0.2*2;
          }
          }
           if(table.getValueAt(i, j).equals("Intercity")){
              km=(table.getValueAt(i, 6).toString());
              Km=Integer.parseInt(km);
              if((box1.getSelectedItem().toString().equals("Copil")||box1.getSelectedItem().toString().equals("Elev")||box1.getSelectedItem().toString().equals("Student")||box1.getSelectedItem().toString().equals("Soldat")||box1.getSelectedItem().toString().equals("Pensionar"))&&box2.getSelectedItem().toString().equals("1")&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.2*2;
          } 
          else{
          if((box1.getSelectedItem().toString().equals("Copil")||box1.getSelectedItem().toString().equals("Elev")||box1.getSelectedItem().toString().equals("Student")||box1.getSelectedItem().toString().equals("Soldat")||box1.getSelectedItem().toString().equals("Pensionar"))&&box2.getSelectedItem().toString().equals("1")&&box2.getSelectedItem().toString().equals("2")){
          pret=Km*0.1*2;
          }  
            }
                }
                
                }
                    }
            if(e.getItem().toString().equals("Mixt")){
              for(int i = 0; i < table.getRowCount(); i++){
                for(int j = 0; j < table.getColumnCount(); j++){
          if(table.getValueAt(i, j).equals("Mixt")){
              km=(table.getValueAt(i, 6).toString());
              Km=Integer.parseInt(km);
              if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.4*2;
          } 
          else{
          if(box1.getSelectedItem().toString().equals("Adult")&&box2.getSelectedItem().toString().equals("2")){
          pret=Km*0.3*2;
          }
          }
           if(table.getValueAt(i, j).equals("Mixt")){
              km=(table.getValueAt(i, 6).toString());
              Km=Integer.parseInt(km);
              if((box1.getSelectedItem().toString().equals("Copil")||box1.getSelectedItem().toString().equals("Elev")||box1.getSelectedItem().toString().equals("Student")||box1.getSelectedItem().toString().equals("Soldat")||box1.getSelectedItem().toString().equals("Pensionar"))&&box2.getSelectedItem().toString().equals("1"))
                  pret=Km*0.2*2;
          } 
          else{
          if((box1.getSelectedItem().toString().equals("Copil")||box1.getSelectedItem().toString().equals("Elev")||box1.getSelectedItem().toString().equals("Student")||box1.getSelectedItem().toString().equals("Soldat")||box1.getSelectedItem().toString().equals("Pensionar"))&&box2.getSelectedItem().toString().equals("1")){
          pret=Km*0.1*2;
          }  
            }
                }
                
                }
                    }
            JOptionPane.showMessageDialog(null,"Pretul este : "+pret);
                        }
                            }
                                });
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                Manager applicationManager = Manager.getInstanta();
                String dataStr = null;
                try {
                    dataStr = T.get_date_tren(applicationManager.getPlecare(), applicationManager.getSosire());
                } catch (ParseException ex) {
                    Logger.getLogger(Panou2.class.getName()).log(Level.SEVERE, null, ex);
                }
                String rows[] = dataStr.split("\n");
                dataVector = new Vector<Vector<String>>();
                for (String row : rows) {
                    row = row.trim();
                    Vector<String> data = new Vector<String>();
                    data.addAll(Arrays.asList(row.split("\\s+")));
                    dataVector.add(data);
                }
                header = new Vector<String>(2);
                header.add("IdTren");
                header.add("De La:");
                header.add("Pana la:");
                header.add("Ora de plecare");
                header.add("Ora de sosire");
                header.add("Tip de tren");
                header.add("Km");
                TableModel model = new DefaultTableModel(dataVector, header);
                table.setModel(model);
            }
        });
                JButton buton2 = new JButton("Cumpara");
                add(buton2);
		buton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
                        Manager2 m= Manager2.getInstanta();
                        m.setDate(box1.getSelectedItem().toString(),box2.getSelectedItem().toString(),box3.getSelectedItem().toString(), t1.getText(),pret);
			if(m.getClasa().equals("Selectati")||m.getTipbilet().equals("Selectati")){
                            JOptionPane.showMessageDialog(null, "Introduceti valori");
                            }
                            else{
                                   CardLayout cardLayout = (CardLayout) cadru.getLayout();
                                    cardLayout.show(cadru, "3");}  
                                    }
                });
                        }
                        
                
		}
         


