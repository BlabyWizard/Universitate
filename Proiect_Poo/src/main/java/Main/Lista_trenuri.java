package Main;

import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Lista_trenuri{
private final ArrayList<Tren> Lista;
public  Lista_trenuri() {
        this.Lista = new ArrayList<Tren>();
    }
public void adauga_Trenuri(Tren Tren){
this.Lista.add(Tren);
}
public int getSize(){
return this.Lista.size();
}
public String getnume(int i){
return this.Lista.get(i).getNume_tren();
}
public int getLoc1(int i){
return Lista.get(i).getClasa1();
}
public int getLoc2(int i){
return Lista.get(i).getClasa2();
}
public String cauta_trenuri(String nume){
    
    int k=0;
    for(int i=0;i<=Lista.size()-1;i++){
        if(Lista.get(i).getNume_tren().equals(nume))
    k++;
    break;
}
    if(k!=0)
    return nume;
    else
        return "Tren gresit";
}
public void  afiseazaLista()
{
    for(int i=0;i<=Lista.size()-1;i++)
    {
    System.out.println(Lista.get(i).getNume_tren()+" Plecare :"+Lista.get(i).getDestinatia1()+" Destinatie :"+Lista.get(i).getDestinatia2()+" Locuri clasa 1 : "+Lista.get(i).getClasa1()+" Locuri clasa 2 : "+Lista.get(i).getClasa2()+" ora de plecare : "+Lista.get(i).getOraPlecare()+" ora de sosire : "+Lista.get(i).getOraSosire());
    }
}
public void verifica_destinatie(String destinatia1,String destinatia2){
    int i, k=0;
    for(i=0;i<=Lista.size()-1;i++)
    if(Lista.get(i).getDestinatia1().equals(destinatia1)&&Lista.get(i).getDestinatia2().equals(destinatia2))
    {
        System.out.println(" Este o optiune Trenul : "+Lista.get(i).getNume_tren()+" Cu plecare din : "+Lista.get(i).getDestinatia1()+" Cu destinatia : "+Lista.get(i).getDestinatia2());
        k++;
    }
 
    if(i==Lista.size()&&k==0)
        System.out.println("Nu sunt trenuri disponibile cu aceasta destinatie");
}
public String verifica_destinatie_tabel(String destinatia1,String destinatia2){
    int i;
    String s="";
    for(i=0;i<=Lista.size()-1;i++)
    if(Lista.get(i).getDestinatia1().equals(destinatia1)&&Lista.get(i).getDestinatia2().equals(destinatia2))
    {
        s=s+Lista.get(i).getNume_tren()+" "+Lista.get(i).getDestinatia1()+" "+Lista.get(i).getDestinatia2()+" "+Lista.get(i).getOraPlecare()+" "+Lista.get(i).getOraSosire()+" "+Lista.get(i).getTip()+" "+Lista.get(i).getKm()+"\n";  
    }
    return s;
}
public String cauta_destinatie1_tabel(String destinatia1,String destinatia2) throws ParseException{
        System.out.println("Alte rute posibile sunt :");
        String timp1;
        String timp2;
        String s="";
        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
    for(int i=0;i<=Lista.size()-1;i++){
        if(Lista.get(i).getDestinatia1().equals(destinatia1)){ 
            for(int j=i+1;j<=Lista.size()-1;j++){
            timp1= Lista.get(i).getOraSosire();
            timp2= Lista.get(j).getOraPlecare();
            Date a = dateFormat.parse(timp1);
            Date b = dateFormat.parse(timp2);
            if(Lista.get(i).getDestinatia2().equals(Lista.get(j).getDestinatia1())&&Lista.get(j).getDestinatia2().equals(destinatia2)&&a.compareTo(b)<=0)
            s=s+Lista.get(i).getNume_tren()+" "+Lista.get(i).getDestinatia1()+"-"+Lista.get(i).getDestinatia2()+" "+Lista.get(j).getDestinatia1()+"-"+Lista.get(j).getDestinatia2()+" "+Lista.get(i).getOraPlecare()+" "+Lista.get(j).getOraSosire()+" "+Lista.get(i).getTip()+"-"+Lista.get(j).getTip()+" "+Lista.get(i).getKm()+"\n";
            }
        }
    }
    return s;
}
    public String cauta_destinatie1(String destinatia1,String destinatia2) throws ParseException{
        System.out.println("Alte rute posibile sunt :");
        String timp1;
        String timp2;
        String s="";
        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
    for(int i=0;i<=Lista.size()-1;i++){
        if(Lista.get(i).getDestinatia1().equals(destinatia1)){ 
            for(int j=i+1;j<=Lista.size()-1;j++){
            timp1= Lista.get(i).getOraSosire();
            timp2= Lista.get(j).getOraPlecare();
            Date a = dateFormat.parse(timp1);
            Date b = dateFormat.parse(timp2);
            if(Lista.get(i).getDestinatia2().equals(Lista.get(j).getDestinatia1())&&Lista.get(j).getDestinatia2().equals(destinatia2)&&a.compareTo(b)<=0)
                System.out.println("Traseu disponibil : "+Lista.get(i).getDestinatia1()+" cu destinatia :"+Lista.get(i).getDestinatia2()+" impreuna cu trenul cu plecarea din : "+Lista.get(j).getDestinatia1()+" cu destinatia :"+Lista.get(j).getDestinatia2());
            }
        }
    }
    return s;
}
    public void ocupareBilet(String nume,int clasa,int a,int b){
    for(int i=0;i<=Lista.size()-1;i++)
    {
    if(Lista.get(i).getNume_tren().equals(nume))
        if(clasa=='1')
        {
            for(int j=a;j>=1;j--){
                System.out.println("Rezervat bilet pentru trenul "+Lista.get(i).getNume_tren()+" cu plecarea din "+Lista.get(i).getDestinatia1()+" de la ora"+Lista.get(i).getOraPlecare()+" cu destinatia "+Lista.get(i).getDestinatia2()+" la ora "+Lista.get(i).getOraSosire()+" pe locul "+j+" la casa 1");
                break;
            }
            a--;
        }
        else
        {
                for(int j=b;j>=1;j--){
                    System.out.println("Rezervat bilet pentru trenul "+Lista.get(i).getNume_tren()+" cu plecarea din "+Lista.get(i).getDestinatia1()+" de la ora "+Lista.get(i).getOraPlecare()+" cu destinatia "+Lista.get(i).getDestinatia2()+" la ora "+Lista.get(i).getOraSosire()+" pe locul "+j+" la clasa 2");
                    break;
                    }
            b--;
        }
    }
    
    }
}