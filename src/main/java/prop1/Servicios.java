
package prop1;

public class Servicios extends Personal{
    
    private int tip;
    private int canHrs;

    public Servicios( String nombre, int anoIni, int tip, int canHrs) {
        super(nombre, anoIni);
        this.tip = tip;
        this.canHrs = canHrs;
    }
    
    public double pagoIni(){
        int vec[]={0,22,18};
        return vec[tip]*canHrs;
    }
    public double bonif(){
        int anos=2022-super.getAnoIni();
        int c=0;
        while(anos>=4){
            anos=anos-4;
            c++;
        }
        return c*0.08*pagoIni();
    }
    @Override
    public double pago() {
        return pagoIni()+bonif();
        
    }
    
    public String print(){
        return super.print()+"Tipo de serv "+tip+"Cant Horas: "+canHrs;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public int getCanHrs() {
        return canHrs;
    }

    public void setCanHrs(int canHrs) {
        this.canHrs = canHrs;
    }
    
    
    
}
