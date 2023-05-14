package Main;


public class Main {

    public static void main(String[] args)throws Exception {
       Prelucrare_trenuri T=new Prelucrare_trenuri("C:\\Users\\adrian\\Desktop\\Sem1\\Student\\Proiect_Poo\\src\\main\\java\\Main\\Tren");
       T.afiseaza_trenuri_Personal();
       T.afiseaza_trenuri_Rapid();
       T.afiseaza_trenuri_Intercity();
       T.afiseaza_lista_trenuri_destinati("Constanta", "Bucuresti");
       T.afiseza_lista_alternativa_trenuri("Constanta", "Iasi");
       T.afiseza_lista_alternativa_trenuri("Constanta", "Brasov");
       T.afiseza_lista_alternativa_trenuri("Constanta", "Timisoara");
       //T.ocupare_Loc("Ir201", 1);
       T.cauta_trenuri("Ir201");
       T.get_date_tren("Constanta", "Iasi");
       
    }
}
