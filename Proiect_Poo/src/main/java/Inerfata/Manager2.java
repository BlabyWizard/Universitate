package Inerfata;

public class Manager2{
private static Manager2 Instanta;
private String Tipbilet;
private String tren;
private String cnp;
private String clasa;
private String Pret;
    Manager2() {
    }
public static Manager2 getInstanta(){
    
    if(Instanta==null)
    {
        Instanta=new Manager2();
    }
   return Instanta; 
}
public void setDate(String Tipilet,String clasa,String tren,String cnp,double Pret){

    this.Tipbilet=Tipilet;
    this.clasa=clasa;
    this.tren=tren;
    this.cnp=cnp;
    this.Pret=Double.toString(Pret);
}

    public String getTipbilet() {
        return Tipbilet;
    }

    public String getTren() {
        return tren;
    }

    public String getCnp() {
        return cnp;
    }

    public String getClasa() {
        return clasa;
    }
    public String getPret() {
        return Pret;
    }
}

