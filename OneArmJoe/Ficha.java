
/**
 * Write a description of class Ficha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ficha
{
    // instance variables - replace the example below with your own
    private int lado1;
    private int lado2;
    private boolean esVisible;

    /**
     * Constructor for objects of class Ficha
     */
    public Ficha(int lado1,int lado2)
    {
        this.lado1=lado1;
        this.lado2=lado2;
        esVisible=false;
    }
    public void hacerVisible(){
        esVisible=true;
    }
    public void hacerInvisible(){
        esVisible=false;
    }
    public void mostrarFicha(){
        System.out.println("["+lado1+"/"+lado2+"]");
    }
}
