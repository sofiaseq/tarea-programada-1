import javax.swing.JOptionPane;
public class MazoTest{
    
    public static void main (String args[]){
        Mazo mazo = new Mazo();
        Jugador diego = new Jugador("Diego");
        Jugador sofi = new Jugador("Sofia");
        Cementerio cementerio = new Cementerio();
        boolean sigueJuego = true;
        boolean turno = true;
        
        mazo.revolver();
        mazo.imprimir();
        System.out.println();
    
        mazo.repartir(diego);
        mazo.repartir(sofi);

        cementerio.pilaDeDescarte[0] = mazo.darSiguienteCarta();
        //Revelar primer carta del mazo al descarte.
        while(sigueJuego){
            if(turno){
                // Turno J1
                String mensaje = cementerio.mostrarUltimaCarta(cementerio.pilaDeDescarte);
                String [] baraja = diego.mostrarBaraja(diego.baraja);
                
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
            if(diego.baraja[0] == null){
                sigueJuego = false;
                //Ganador player1
            }else if(sofi.baraja[0] == null){
                sigueJuego = false;
                //Ganador player2                
            }
            //Game Over?
                sigueJuego = false;
        }

        
        /*mazo.comeDos(diego);
        mazo.comeDos(sofi);
        
        cementerio[0] = diego.baraja[0];
        cementerio[1] = diego.baraja[1];
        cementerio[2] = diego.baraja[2];
        cementerio[3] = diego.baraja[3];
        
        diego.baraja[0].imprimir();
        diego.baraja[1].imprimir();
        diego.baraja[2].imprimir();
        diego.baraja[5].imprimir();
        diego.baraja[6].imprimir();
        
        sofi.baraja[0].imprimir();
        sofi.baraja[1].imprimir();
        sofi.baraja[2].imprimir();
        sofi.baraja[5].imprimir();
        sofi.baraja[6].imprimir();
        
        mazo.buscarCementerio(cementerio);
        
        //mazo.darSiguienteCarta();
        //mazo.darSiguienteCarta();
        //mazo.darSiguienteCarta();
        /*
         * 
          boolean terminoPartida?
          while(terminoPartida?){
              Jugador1 play card
                if puedeJugarCarta
                    switch( CartaJugada)
                    case comeDos
                        mazo.comeDos(jugador2)
                        
           */
    }    
    
}