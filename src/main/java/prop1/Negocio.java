
package prop1;
import java.util.*;
public class Negocio {
    private ArrayList<Personal> lis=new ArrayList();

    public Negocio() {
        lis.add(new Medicos("Piero", 2022, 2, 48));
        lis.add(new Medicos("Piero", 2022, 2, 48));
        lis.add(new Medicos("Piero", 2022, 2, 48));
        
        lis.add(new Servicios("Alvaro", 1850,2, 40));
        lis.add(new Servicios("Alvaro", 1850,2, 40));
        lis.add(new Servicios("Alvaro", 1850,2, 40));
        lis.add(new Servicios("Alvaro", 1850,2, 40));
    }
    
    public void adi_Med(Medicos m){
        lis.add(m);
    }
    
    public void adi_Serv(Servicios s){
        lis.add(s);
    }
    
    
    public Personal buscar(int nro){
        for(Personal x:lis){
            if(x.getCodigo()==nro){
                return x;
            }
        }
        return null;
        
    }
    
    
    public ArrayList<Personal> getLis() {
        return lis;
    }

    public void setLis(ArrayList<Personal> lis) {
        this.lis = lis;
    }
    
    
    
    
    
}
