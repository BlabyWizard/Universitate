import java.util.ArrayList;
import java.util.List;
class ListeTranzii {
    private final  ArrayList<Tranzitie> List ;

    public ListeTranzii() {
        this.List = new ArrayList<Tranzitie>();
    }
    public int getSize(){
    return List.size();
    }
    
    public void adaugaLista(Tranzitie t){
        this.List.add(t);
    }    
    public Tranzitie gasesteTranzitie(String a,char b){
        for(Tranzitie t: this.List)
        {
            if(t.getStareInitiala().equals(a)&&t.getSimbol()==b){
              return t;  
            } 
        }
        
        return null;
   }
    public void afiseazaLista()
    {
        System.out.print("Lista mea este : ");
    for(int i=0;i<=List.size()-1;i++)
        {System.out.print(List.get(i).getStareInitiala()+" "+List.get(i).getSimbol()+" "+List.get(i).getStareFinala()+" | ");
    }
        System.out.println();
    }
    public Tranzitie getTranzitie(int a)
    {
       return List.get(a);
    }
    public void getCaracter(){
     String limbaj="";
    for(Tranzitie t : List ){
        char a=t.getSimbol();
        if(limbaj.indexOf(a) != -1){
            continue;
        }
            
        limbaj+=" "+a;
    }
    System.out.println("Limbajul automatului meu este ="+limbaj);
    }
    
    public void verificare(Tranzitie a, Tranzitie b){
        int k = 0;
          if((a.getStareInitiala().equals(b.getStareInitiala()))&&(a.getStareFinala().equals(b.getStareFinala())&&(a.getSimbol()==b.getSimbol())))
          {
              System.out.println("Sa gasit tranzitia "+a.getStareInitiala()+" "+a.getSimbol()+" "+a.getStareFinala()+" egala cu tranzitia "+b.getStareInitiala()+" "+b.getSimbol()+" "+b.getStareFinala());
              k=1;
          }  
      if(k==-1)
      { 
      System.out.println("Nu s-au gasit tranziti identice");
      }  
    }
    public void verificare1(String si1,char s1,String sf1,String si2,char s2,String sf2){
        int k = 0;
          if(s1==s2)
          {
              System.out.println("Sa gasit tranzitia "+si1+" "+s1+" "+sf1+" egala cu tranzitia "+si2+" "+s2+" "+sf2);
              k=1;
          }  
      if(k==0)
      { 
      System.out.println("Nu s-au gasit tranziti identice intre "+si1+" "+s1+" "+sf1+" si "+si2+" "+s2+" "+sf2);
      }  
    }
    
   
}
