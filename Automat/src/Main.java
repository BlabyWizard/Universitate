class Main {
  public static void main(String args[]) throws Exception {
    Automat M = new Automat("C:\\Users\\adrian\\Desktop\\Student\\Automat\\src\\Automaton");
    System.out.println(M.analizeazaCuvant("baaa"));
    M.afisareAlfabet();
    //M.AfisareLista();
    M.cautareTranzitiEgale1();
      char b = 'b';
    M.Simbol(b);
  }
}