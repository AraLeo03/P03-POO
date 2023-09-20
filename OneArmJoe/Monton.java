import java.util.ArrayList;
/**
 * Write a description of class Monton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monton
{
    // instance variables - replace the example below with your own
    private int mulaMax;
    ArrayList<Ficha> monton;

    /**
     * Constructor for objects of class Monton
     */
    public Monton(int mulaMax)
    {
        this.mulaMax=mulaMax;
        ArrayList<Ficha> monton = new ArrayList();
    }
    public void llenarMonton(){
        for(int i=0;i<=mulaMax;i++){
            for(int j=0;j<=i;j++){
                monton.add(new Ficha(i,j));
            }
        }
    }
}
