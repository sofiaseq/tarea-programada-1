import javax.swing.JOptionPane;
public class Juego{
    //jugarJugador
    //jugarAi
    //llamar interfaz
    //traer while del MazoTest
    //metodo para recibir el tipo de juego (pvp o ai) desde interfaz
    
    public void jugarJugador(){
        Mazo mazo = new Mazo();
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        Cementerio cementerio = new Cementerio();
        boolean sigueJuego = true;
        boolean turno = true;
        
        mazo.revolver();
        mazo.imprimir();
        mazo.repartir(jugador1);
        mazo.repartir(jugador2);
        cementerio.pilaDeDescarte[0] = mazo.darSiguienteCarta();
        
        while(sigueJuego){
            if(turno){
                // Turno J1
                String mensaje = cementerio.mostrarUltimaCarta(cementerio.pilaDeDescarte);
                String [] baraja = jugador1.mostrarBaraja(jugador1.baraja);
                
                String resp1 = (String)JOptionPane.showInputDialog(null, mensaje + " Las cartas de su baraja son: ", "", JOptionPane.DEFAULT_OPTION, null, baraja , baraja[0]);
                System.out.println(resp1);
                turno = false;
                // J1 puede ver sus cartas y la última carta de descarte
                // J1 seleccionar cartas a jugar o comer 1
            }else{
                //Turno J2
                turno = true;
            }
            
            // Validar si puede jugar la carta que seleccionó
            // Es especial?
            if(jugador1.baraja[0] == null){
                sigueJuego = false;
                //Ganador player1
            }else if(jugador2.baraja[0] == null){
                sigueJuego = false;
                //Ganador player2                
            }
            //Game Over?
                sigueJuego = false;
        }
        
   }
    
}