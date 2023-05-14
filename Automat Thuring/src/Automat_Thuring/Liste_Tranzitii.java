package Automat_Thuring;
import java.util.ArrayList;


class Liste_Tranzitii{
    
    private final  ArrayList<Tranzitie> List ;
    
    public  Liste_Tranzitii() {
        
        this.List = new ArrayList<>();
    }
    
    public void adaugaLista(Tranzitie t){
        
        this.List.add(t);
    }
    public String getDirectie(int i){
        return List.get(i).getDirectie();
    }
    
    public boolean verificareSimbol(String sim ,Tranzitie t){
        if(sim.equals(t.getSimbol_gasit()))
            return true;
        else
            return false;
    }
    public boolean verificareStareIn (String stare , Tranzitie t){
        if(stare.equals(t.getStare_initiala()))
            return true;
        else
            return false;
    }
    
    public Tranzitie getTranzitie(String stare,String sim){
        return List.stream().filter( x -> x.getStare_initiala().equals(stare) && x.getSimbol_gasit().equals(sim)).findFirst().orElse(null);
    }
    
    public int verificareModificare(int i,String cuvant){
        String a = String.valueOf(cuvant.charAt(i));
        if(List.get(i).getSimbol_gasit().equals(a))
        {
         return 1;   
        }
        else
            return 0;
    }
    
    public void modificare(int i , String[] cuvant){
        for(int j=0; j<=5;j++)
        {
            System.out.print(cuvant[i]);
        }
        cuvant[i]=List.get(i).getSchimb();
        System.out.println(cuvant[i]);
        for(int j=0; j<=cuvant.length-1;j++)
        {
            System.out.print(cuvant[j]);
        }
        System.out.println();
        
    }
    public Tranzitie getTranzitie(int i){
        return List.get(i);
    }
    public String getSchib(int i){
        return List.get(i).getSchimb();
    }
    public String getSimbol(int i){
        return List.get(i).getSimbol_gasit();
    }
    
    public String getStareInitiala(int i)
    {
        return List.get(i).getStare_initiala();
    }
    
    public String getStareFinala(int i)
    {
        return List.get(i).getStare_finala();
    }

    public String cautaDirectie(int i){
        return List.get(i).getDirectie();
    }
    
    public void afisareLista(){
        
        for(int i=0;i<=List.size()-1;i++)
            System.out.println(List.get(i).getTranzitie());
    }
    public void afisareTranzitie(int i){
        System.out.println(List.get(i).getTranzitie());
    }
    public int getSize(){
        return List.size();
    }
    
//    public void modificare(Tranzitie t){
//    
//        for(int i=0;i<=List.size();i++){
//        
//            String Sch= t.getSchimb();
//            Directie d= Directie.valueOf(t.getDirectie());
//            
//            
//        }
//    
//    }
    
        
    }
