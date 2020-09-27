public class Jugador {

    public String nombre;
    public Carta[] baraja;
    public int posSiguienteCarta = 0;
    
    public Jugador(String nombre){
        this.nombre = nombre;
        this.baraja = new Carta[45];
    }
    public void setPosSiguiente(int pos){
        this.posSiguienteCarta = pos;
    }
}
