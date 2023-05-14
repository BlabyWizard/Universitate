package Main;

import java.util.Scanner;
import java.time.*;
public class Ora{
int ora;
int minut;
LocalTime timp1;
public Ora(int ora,int minut){
this.ora=ora;
this.minut=minut;
this.timp1=LocalTime.of(ora, minut);
}
public void set_ora(int ora,int minut){
this.ora=ora;
this.minut=minut;
this.timp1=LocalTime.of(ora, minut);
}
public LocalTime get_ora(){
return timp1; }
}
