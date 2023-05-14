package Main;

public class Tren{
private final String nume_tren;
private final String destinatie1;
private final String destinatie2;
private final int clasa1;
private final int clasa2;
private final String ora_plecare;
private final String ora_sosire;
private final String tip;
private final String km;

    public Tren(String nume_tren,String destinatie1,String destinatie2, int clasa1,int clasa2,String ora_plecare,String ora_sosire,String tip,String km) {
        this.nume_tren = nume_tren;
        this.destinatie1= destinatie1;
        this.destinatie2= destinatie2;
        this.clasa1 = clasa1;
        this.clasa2 = clasa2;
        this.ora_plecare= ora_plecare;
        this.ora_sosire= ora_sosire;
        this.tip=tip;
        this.km=km;
    }

    public String getNume_tren() {
        return nume_tren;
    }
    public String getTip(){
        return tip;
    }
    public String getKm(){
    return km;
    }
    public String getDestinatia1(){
        return destinatie1;
    }
    public String getDestinatia2(){
        return destinatie2;
    }

    public int getClasa1() {
        return clasa1;
    }

    public int getClasa2() {
        return clasa2;
    }
    public String getOraPlecare(){
    return ora_plecare;}
    
        public String getOraSosire(){
    return ora_sosire;
    }
}