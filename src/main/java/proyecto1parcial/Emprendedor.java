package proyecto1parcial;

public class Emprendedor extends Persona{
    private String desServicio;
    
    //Constructor
    public Emprendedor(String ni, String np, String npr, String t, String e, String d, String sw, String ds){
        super(ni,np,npr,t,e,d,sw);
        desServicio=ds;
    }
    
    //Getters y Setters
    public String getDesServicio(){
        return desServicio;
    }
    
    public void setDesServicio(String ds){
        desServicio=ds;
    }
    
    
    
}
