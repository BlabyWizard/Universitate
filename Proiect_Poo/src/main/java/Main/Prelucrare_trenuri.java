package Main;
import Main.Lista_trenuri;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
public class Prelucrare_trenuri{
private String nume;
private int loc1;
private int loc2;
private Lista_trenuri Lista_Personal=new Lista_trenuri();
private Lista_trenuri Lista_Rapid=new Lista_trenuri();
private Lista_trenuri Lista_Intercity=new Lista_trenuri();
private Lista_trenuri Lista_Trenuri=new Lista_trenuri();
    
   public Prelucrare_trenuri(String nume) throws Exception {
    
        BufferedReader buf = new BufferedReader(new FileReader(nume));
    
    while(true){
    String p=buf.readLine();
    if(p==null)
        break;
    else{
    String[] pre= p.split(" ");
    int c1=Integer.parseInt(pre[3]);
    int c2=Integer.parseInt(pre[4]);
    
    Tren tr=new Tren(pre[0],pre[1],pre[2],c1 ,c2, pre[5],pre[6],pre[7],pre[8]);
    
    Lista_Trenuri.adauga_Trenuri(tr);
    
    if(pre[7].equals("Personal")){
    Lista_Personal.adauga_Trenuri(tr);}
    
    if(pre[7].equals("Rapid")){
    Lista_Rapid.adauga_Trenuri(tr);}
    
    if(pre[7].equals("Intercity")){
    Lista_Intercity.adauga_Trenuri(tr);}    
    
    }
}
   
    }
     public void cauta_trenuri(String nume){
    System.out.println(Lista_Trenuri.cauta_trenuri(nume));
    }
     public void afiseaza_trenuri_Personal(){
         System.out.println("Lista trenurilor Personale:");
    Lista_Personal.afiseazaLista();
    }
     public void afiseaza_trenuri_Rapid(){
         System.out.println("Lista trenurilor Rapide:");
    Lista_Rapid.afiseazaLista();
    }
     public void afiseaza_trenuri_Intercity(){
         System.out.println("Lista trenurilor Intercity:");
    Lista_Intercity.afiseazaLista();
    }
     public void afiseaza_lista_trenuri_destinati(String destinatia1,String destinatia2){
         System.out.println("Rute disponibile intre "+destinatia1+" si "+destinatia2+" sunt :");
         System.out.println("Trenuri Personale :");
         Lista_Personal.verifica_destinatie(destinatia1, destinatia2);
         System.out.println("Trenuri Rapide :");
         Lista_Rapid.verifica_destinatie(destinatia1, destinatia2);
         System.out.println("Trenuri Intercity :");
         Lista_Intercity.verifica_destinatie(destinatia1, destinatia2);
}
     public void afiseza_lista_alternativa_trenuri(String destinatia1,String destinatia2) throws ParseException{
     Lista_Trenuri.cauta_destinatie1(destinatia1, destinatia2);
     }
     public void ocupare_Loc(String nume,int clasa) throws FileNotFoundException, IOException{
         int i,k=0;
         for(i=0;i<=Lista_Trenuri.getSize();i++)
         {
             if(Lista_Trenuri.getnume(i).equals(nume)){
                 k++;
                 break;
             }
         }
         
         if(k!=0){    
    String p=Files.readAllLines(Paths.get("C:\\Users\\adrian\\Desktop\\Student\\Proiect_Poo\\src\\main\\java\\Main\\Ocupare_tren")).get(i);
    String[] ocupare= p.split(" ");
    int a=Integer.parseInt(ocupare[0]);
    int b=Integer.parseInt(ocupare[1]);
    Lista_Trenuri.ocupareBilet(nume, clasa, a, b);
    for(i=1;i<=Lista_Trenuri.getSize();i++){
     if(a<=Lista_Trenuri.getLoc1(i)){
        File file = new File("C:\\Users\\adrian\\Desktop\\Student\\Proiect_Poo\\src\\main\\java\\Main\\Ocupare_tren");
        FileWriter fr = new FileWriter(file,true);
        a=+1;
        fr.write("1");
        fr.close();
        System.out.println("Loc ocupat");
     }
    }
         }
     }
     

     public String get_date_tren(String s1 , String s2) throws ParseException{
     String s="";
     s=s+Lista_Trenuri.verifica_destinatie_tabel(s1, s2);
     s=s+Lista_Trenuri.cauta_destinatie1_tabel(s1, s2);
     return s;
     
}

}
