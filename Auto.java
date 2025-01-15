
public class Auto
{
    //atributos 
    private String color;
    private int año; 
    private int aceleracion;
    private int acelera;
    // constructor 
    public Auto(String color, int año, int aceleracion ){
        this.color = color;
        this.año = año;
        this.aceleracion = aceleracion;
    }
    // metodos
    public boolean encendido(){
        return true;
    }
    //metodos
    public boolean apagado(){
        return false;
    }
    // metodos
    public int acelerar(){

        if(acelera < aceleracion){
            acelera++;
        }
        return acelera;
    }
    // metodo Obtener color
    public String getColor(){
        return this.color;
    }
    // metodo obtener año
    public int getAño(){
        return this.año;
    }
    // metodo obtener aceleracion maxima del auto
    public int getAceleracion(){
        return this.aceleracion;
    }
    // metodo cabiar color
    public void setColor(String color){
        this.color = color;
    }
    // metodo cambiar año
    public void setAño(int año){
        this.año = año;   
    }
    // metosdo cambiar aceleracion
    public void setAceleracion(int aceleracion){
        this.aceleracion = aceleracion;
    }
}