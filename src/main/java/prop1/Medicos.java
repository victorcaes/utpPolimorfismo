
package prop1;

public class Medicos extends Personal{
    
    private int esp;
    private int canPac;

    public Medicos(  String nombre, int anoIni, int esp, int canPac) {
        super(nombre, anoIni);
        this.esp = esp;
        this.canPac = canPac;
    }
    
    @Override
    public double pago() {
        double vec[]={0,20,25,30};
        return canPac*vec[esp];
         
    }
    public String print(){
        super.print();
        return "Especialdiad "+esp+"Cantidad de pacientes: "+canPac+"pago "+pago();
    }

    public int getEsp() {
        return esp;
    }

    public void setEsp(int esp) {
        this.esp = esp;
    }

    public int getCanPac() {
        return canPac;
    }

    public void setCanPac(int canPac) {
        this.canPac = canPac;
    }
}
