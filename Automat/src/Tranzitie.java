public class Tranzitie {
  private final String stare_initiala;
  private final char simbol;
  private final String stare_finala;

  Tranzitie(String stare_initiala, char simbol, String stare_finala) {
    this.stare_initiala = stare_initiala;
    this.simbol = simbol;
    this.stare_finala = stare_finala;
  }

  public String getStareInitiala() {
    return stare_initiala;
  }
  public String getStareFinala() {
    return stare_finala;
  }
  public char getSimbol() {
    return simbol;
  }
 
}