
/**
 * Write a description of class JuegoOAJ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JuegoOAJ
{
    // instance variables - replace the example below with your own
    int mulaMax;
    int cantJugadores;
    boolean finDeJuego = false;

    /**
     * Constructor for objects of class JuegoOAJ
     */
    public JuegoOAJ()
    {
        // initialise instance variables
        Tablero t1 = new Tablero();
        Jugador p1 = new Jugador();
        if(cantJugadores>=2 && cantJugadores<=3){
            mulaMax=6;
        }else if(cantJugadores>=4 && cantJugadores<=6){
            mulaMax=9;
        }else if(cantJugadores>=7 && cantJugadores<=10){
            mulaMax=12;
        }else{
            System.out.println("No se puede jugar.");
        }
    }
    
    public void setJugadores(int cantJugadores){
        this.cantJugadores = cantJugadores;
    }
    public int getJugadores(){
        return cantJugadores;
    }
    public void setMulaMax(int mulaMax){
        this.mulaMax = mulaMax;
    }
    public int getMulaMax(){
        return mulaMax;
    }
}
