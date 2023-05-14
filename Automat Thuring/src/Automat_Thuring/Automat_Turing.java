package Automat_Thuring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
  public class Automat_Turing {
   String st_int;
   final ArrayList < String > stari_finale = new ArrayList < > ();
   Liste_Tranzitii Lista = new Liste_Tranzitii();

  Automat_Turing(String fisier) throws Exception {
    BufferedReader buf = new BufferedReader(new FileReader(fisier));
    this.st_int = buf.readLine();
    String[] stari_finale_str = buf.readLine().split(" ");
    for (String s: stari_finale_str) {
      this.stari_finale.add(s);
    }
    while (true) {
      String tmp = buf.readLine();
      if (tmp == null)
        break;
      else {
        String tbl[] = tmp.split(" ");
        Tranzitie tr = new Tranzitie(tbl[0], tbl[1], tbl[2], tbl[3], tbl[4]);
        Lista.adaugaLista(tr);
      }
    }
  }
  void modificareeCuvant(String cuvant) {
    
    cuvant = "B" + cuvant + "B";
    List<String> cuv = Arrays.asList(cuvant.split(""));
    int cursor = 1;
    Tranzitie tranzitie = Lista.getTranzitie(this.st_int, cuv.get(cursor));
    while (tranzitie != null) {
      if (Lista.verificareSimbol(cuv.get(cursor), tranzitie)) {
        System.out.println(String.join("", cuv));
        System.out.println(cursor);
        System.out.println(tranzitie.getStare_finala());
        this.st_int = tranzitie.getStare_finala();
        cuv.set(cursor, tranzitie.getSchimb());
        Directie dir = Directie.valueOf(tranzitie.getDirectie());
        System.out.println(cuv.size());
        System.out.println(dir);
        switch (dir) {
        case L -> {
          cursor--;
          break;
        }
        case R -> {
            if(cursor==cuv.size()-1)
            {
                cuv.add("B");
                System.out.println("Size"+cuv.size());
            }
          cursor++;
          break;
        }
        case B -> {
          break;
        }
        }

        tranzitie = Lista.getTranzitie(st_int, cuv.get(cursor));
      }
    }
    System.out.println("Stare finala= " +
      st_int);
    if (stari_finale.contains(st_int)) {
      System.out.println("Da");
    } else {
      System.out.println("Nu coaie");
    }
  }

  //       void modificareeCuvant(String cuvant){
  //   
  //       String tr= this.st_int;
  //       char[] S= cuvant.toCharArray();
  //       String[] cuv= new String[cuvant.length()];
  //       for(int i=0; i<=cuvant.length()-1;i++){
  //           cuv[i]=String.valueOf(S[i]);
  //       }
  //       /*for(int i=0; i<=cuvant.length()-1;i++){
  //           System.out.println(cuv[i]);
  //       }*/
  //        if(tr==null)
  //            System.out.println("Nu");
  //        else
  //        {
  //            int i=0;
  //             Tranzitie T =new Tranzitie(Lista.getStareInitiala(i),Lista.getSimbol(i),Lista.getSchib(i),Lista.getDirectie(i),Lista.getStareFinala(i));
  //             //System.out.println(T.getStare_initiala()+" "+T.getSimbol_gasit()+" "+T.getSchimb()+" "+T.getDirectie()+" "+T.getStare_finala());
  //            while(verificareWhile(tr,stari_finale)!=true){
  //                System.out.println("Intrare = "+i);
  //                System.out.println("Cuv[i]= "+cuv[i]);
  //                System.out.println("Stare in = "+T.getStare_initiala());
  //                System.out.println("T.schimb= "+T.getSchimb());
  //                System.out.println("T.stareIn= "+T.getStare_initiala());
  //                System.out.println("T.simbol= "+T.getSimbol_gasit());
  //                if(Lista.verificareSimbol(cuv[i],T)==true&&Lista.verificareStareIn(tr, T)==true)
  //                {
  //                    for(int j=0;j<=Lista.getSize()-1;j++){
  //                        if(Lista.getStareInitiala(j).equals(T.getStare_finala())&&Lista.getSimbol(j).equals(cuv[i]))
  //                        {
  //                            cuv[i]=T.getSchimb();
  //                            T = Lista.getTranzitie(j);
  //                            break;
  //                        }
  //                           // T =new Tranzitie(Lista.getStareInitiala(i),Lista.getSimbol(i),Lista.getSchib(i),Lista.getDirectie(i),Lista.getStareFinala(i));
  //                   }
  //                    System.out.println(T.getStare_initiala()+" "+T.getSimbol_gasit()+" "+T.getSchimb()+" "+T.getDirectie()+" "+T.getStare_finala());
  //                    //Lista.afisareTranzitie(i);
  //                    //Lista.modificare(i, cuv);
  //                    //tr=Lista.getStareFinala(i);
  //                    //System.out.println("T.schimb= "+T.getSchimb());
  //                    Directie dir=Directie.valueOf(T.getDirectie());
  //                    for(int j=0;j<=cuv.length-1;j++)
  //                        System.out.print(cuv[j]);
  //                    System.out.println();
  //                    switch(dir){
  //                        
  //                        case L:
  //                        {
  //                            //System.out.println("Val=L");
  //                            i--;
  //                            //tr=Lista.getStareFinala(i);
  //                            break;
  //                        }
  //                        case R:
  //                        {
  //                            //System.out.println("Val=R");
  //                            i++;
  //                           // tr=Lista.getStareFinala(i);
  //                            break;
  //                        }
  //                        case B:
  //                        {
  //                            //System.out.println("Val=B");
  //                            //tr=Lista.getStareFinala(i);
  //                            break;
  //                        }
  //                      
  //                }
  //                        tr=Lista.getStareFinala(i);
  //                        //Lista.afisareTranzitie(i);
  //                        System.out.println(i);
  //                        System.out.println(Lista.getStareFinala(i));
  //                        System.out.println("tr= "+tr);
  //                        
  //                }
  //               
  //            }
  //        } 
  //        
  //    }

  public void afisareLista() {
    Lista.afisareLista();
  }
  public boolean verificareWhile(String tr, ArrayList St) {

    //           System.out.println(St.get(0));
    for (int i = 0; i < St.size(); i++)
      if (tr.equals(St.get(i))) {

        return true;
      }
    return false;
  }
}