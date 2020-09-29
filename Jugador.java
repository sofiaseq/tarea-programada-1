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
    
    public String [] mostrarBaraja(Carta[] baraja){
        String [] strBaraja = new String [baraja.length];
        for(int i = 0; i < baraja.length; i++){
            if(baraja[i] != null){
                strBaraja[i] = baraja[i].getNombreCarta();   
            }else{
                break;
            }            
        }
        
        return strBaraja;
        
    }
}
