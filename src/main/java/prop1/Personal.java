
package prop1;

public abstract class Personal {
    private int codigo;
    private String nombre;
    private int anoIni;
    static int contador=100;

    public Personal(String nombre, int anoIni) {
        this.codigo = contador++;
        this.nombre = nombre;
        this.anoIni = anoIni;
    }

    
    
    public abstract double pago();
    
    public String print(){
        return "Codigo "+codigo+"Nombre "+nombre+"año de inicio "+anoIni+"pago : "+pago();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoIni() {
        return anoIni;
    }

    public void setAnoIni(int anoIni) {
        this.anoIni = anoIni;
    }
    
    
 
    
    
    
    
    
}
