import javax.swing.JOptionPane;
public class Interfaz{
    
    public int bienvenida(){
        int jugar;
        int seleccion = 0;
        jugar = JOptionPane.showConfirmDialog(null,"Bienvenido a Uno y Medio, ¿Desea jugar?"," ", JOptionPane.YES_NO_OPTION);
        
        if(jugar == 0){
           int verManual;
           verManual = JOptionPane.showConfirmDialog(null,"¿Desea leer el manual?"," ", JOptionPane.YES_NO_OPTION);
           if(verManual == 0){
               JOptionPane.showMessageDialog(null,"¿En qué consiste el juego? \n \n En este juego participarán dos jugadores, ya sea PvP o PvAI.\n Existirán 73 cartas, 16 de cada color: rojo, naranja,verde y azul,\n dos por cada número del 0 al 7, luego, existirán 3 cartas especiales \n de color negro de las siguientes: “+2”, “buscar” y “cancelar”.","Manual de Uno y Medio", JOptionPane.INFORMATION_MESSAGE);
               JOptionPane.showMessageDialog(null, "Cartas especiales.\n \n “Buscar” tiene como función ver el mazo de cartas jugadas para escoger \n una y jugarla, la carta “cancelar” tiene como efecto anular la función \n de una carta especial, de modo que si se cancela una carta del oponente,\n este tendrá que tirar otra carta. Por último, la carta +2 tiene como función \n hacer comer al otro jugador dos cartas del mazo, en caso que el otro jugador \n responda con otra carta +2, se acumulará la suma (+4), y así sucesivamente.","Manual de Uno y Medio", JOptionPane.INFORMATION_MESSAGE);
               JOptionPane.showMessageDialog(null,"¿Cómo jugar? \n \n Para iniciar el juego se revolverá el mazo de cartas y se repartirán 5  cartas a \n cada jugador. Después de esto, se vuelve la primera carta del juego para poder \n dar inicio a este. Siempre empieza el jugador 1. La carta que los jugadores podrán \n jugar tendrá que ser del mismo color o número de la anteriormente colocada. \n Las cartas especiales se podrán colocar sobre cualquier color o número. \n En caso que un jugador no tenga cartas validas para jugar, deberá tomar una carta \n del mazo y sumarla a su baraja, de modo que cuenta como turno. \n El primer jugador en quedarse sin cartas, ¡gana! \n \n Creadores: Sofía Sequeira y Diego Madrigal.", "Manual de Uno y Medio", JOptionPane.INFORMATION_MESSAGE);
            }
           String[] options = {"PvP", "AI"};
           seleccion = JOptionPane.showOptionDialog(null, "Seleccione un modo de juego", " ", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        }
        System.out.println(seleccion);
        return seleccion;
   }
   
}