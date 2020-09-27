public class MazoTest{
    
    public static void main (String args[]){
        Mazo mazo = new Mazo();
        Jugador diego = new Jugador("Diego");
        Jugador sofi = new Jugador("Sofia");
        Carta[] cementerio = new Carta[73];
        
        mazo.revolver();
        mazo.imprimir();
        System.out.println();
    
        mazo.repartir(diego);
        mazo.repartir(sofi);
        
        mazo.comeDos(diego);
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