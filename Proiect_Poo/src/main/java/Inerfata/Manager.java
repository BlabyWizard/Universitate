package Inerfata;

public class Manager{
private static Manager Instanta;
private String plecare;
private String sosire;
    private Manager() {
    }
public static Manager getInstanta(){
    
    if(Instanta==null)
    {
        Instanta=new Manager();
    }
   return Instanta; 
}
public void setDestinati(String plecare,String sosire){

    this.plecare=plecare;
    this.sosire=sosire;
}

    public String getPlecare() {
        return plecare;
    }

    public String getSosire() {
        return sosire;
    }
}
