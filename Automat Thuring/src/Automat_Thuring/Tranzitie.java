package Automat_Thuring;
public class Tranzitie {
  private final String stare_initiala;
  private final String simbol_gasit;
  private final String schimb;
  private final String directie;
  private final String stare_finala;

  Tranzitie(String Stare_in, String simbol_gasit, String schimb, String directie ,String Stare_fin) {
    this.stare_initiala= Stare_in;
    this.simbol_gasit = simbol_gasit;
    this.schimb = schimb;
    this.directie = directie;
    this.stare_finala=Stare_fin;
  }

    public String getSimbol_gasit() {
        return simbol_gasit;
    }

    public String getSchimb() {
        return schimb;
    }

    public String getDirectie() {
        return directie;
    }

    public String getStare_initiala() {
        return stare_initiala;
    }

    public String getStare_finala() {
        return stare_finala;
    }
    public String getTranzitie(){
        return stare_initiala+" "+simbol_gasit+" "+schimb+" "+directie+" "+stare_finala;
    }
    

  
}