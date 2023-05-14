import java.io.*;
import java.util.ArrayList;
class Automat {
  private String st_int;
  private final ArrayList<String> stari_finale = new ArrayList<>();
  private ListeTranzii Lista = new ListeTranzii();

  Automat(String nume) throws Exception {
    BufferedReader buf = new BufferedReader(new FileReader(nume));
    this.st_int = buf.readLine();
    String[] stari_finale_str = buf.readLine().split(" ");
    for (String s : stari_finale_str) {
        this.stari_finale.add(s);
    }
    while (true) {
      String tmp = buf.readLine();
      if (tmp == null)
        break;
      else {
        String tbl[] = tmp.split(" ");
        Tranzitie tr = new Tranzitie(tbl[0], tbl[1].charAt(0), tbl[2]);
        Lista.adaugaLista(tr);
      }
    }    
  }
  
  boolean analizeazaCuvant(String sir_intrare){
      String tr= this.st_int;
        for(int i=0;i<sir_intrare.length();i++){
        Tranzitie a= Lista.gasesteTranzitie(tr, sir_intrare.charAt(i));
        if(a==null)
        {
        return false;
        }
        tr = a.getStareFinala();
        }
        return this.stari_finale.contains(tr);
  }
  public void afisareAlfabet(){
      Lista.getCaracter();
  }
  public void cautareTranzitiEgale(){
     int n=Lista.getSize(); 
  for(int i=0;i<=n;i++)
  {   
      Tranzitie a=Lista.getTranzitie(i);
  for(int j=i+1;j<=n;j++)
    {
      Tranzitie b=Lista.getTranzitie(j);
      Lista.verificare(a, b);
    }
  }
  }
    public void cautareTranzitiEgale1(){
     int n=Lista.getSize(); 
  for(int i=0;i<=n-1;i++)
  {   
      String si1=Lista.getTranzitie(i).getStareInitiala();
      char s1=Lista.getTranzitie(i).getSimbol();
      String sf1=Lista.getTranzitie(i).getStareFinala();
  for(int j=i+1;j<=n-1;j++)
    {
      String si2=Lista.getTranzitie(j).getStareInitiala();
      char s2=Lista.getTranzitie(j).getSimbol();
      String sf2=Lista.getTranzitie(j).getStareFinala();
      Lista.verificare1(si1,s1,sf1,si2,s2,sf2);
    }
  }
  }
  public void AfisareLista(){
      Lista.afiseazaLista();
  }
  public void Simbol(char s){
      for(int i=0;i<=Lista.getSize()-1;i++)
          if(Lista.getTranzitie(i).getSimbol()==s)
           System.out.print(Lista.getTranzitie(i).getStareInitiala()+" "+Lista.getTranzitie(i).getSimbol()+" "+Lista.getTranzitie(i).getStareFinala()+" | ");
}
}
