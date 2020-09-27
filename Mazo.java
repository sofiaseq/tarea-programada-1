import javax.swing.JOptionPane;
public class Mazo{
    private Carta[] cartas;
    int posSiguienteCarta = 0;
    
    public Mazo(){
        this.crearCarta();
    }
   
    public String obtenerColor(int valor){
        String resultado = "";
        switch(valor){
            case 0:
                resultado = "rojo";
            break;
            case 1:
                resultado = "rojo";
            break;
            case 2:
                resultado = "azul";
            break;
            case 3:
                resultado = "azul";
            break;
            case 4:
                resultado = "naranja";
            break;
            case 5:
                resultado = "naranja";
            break;
            case 6:
                resultado = "verde";
            break;
            case 7:
                resultado = "verde";
            break;
            case 8:
                resultado = "negro";
            break;
            case 9:
                resultado = "negro";
            break;
            case 10:
                resultado = "negro";
            break;
        }
        return resultado;
    }
    
    public void crearCarta(){
        cartas = new Carta [73];
        int cont = 0;
        
        for(int j = 0; j < 11; j++){
            if(j<8){
                for(int i = 0; i < 8; i++){
                    Carta carta = new Carta(i, obtenerColor(j));
                    cartas[cont] = carta;
                    cont++;
                }
            }
            else{
                for(int k = 8; k < 11; k++){
                    Carta carta = new Carta(k, obtenerColor(k));
                    cartas[cont] = carta;
                    cont++;
                }
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0 ; i < cartas.length; i++){
            cartas[i].imprimir();
        }
    }
    
    public void revolver(){
        for(int i = 0; i < cartas.length; i++){
            int celdaAleatoria = (int)(Math.random()*73);
            Carta tem = cartas[i];
            cartas[i] = cartas[celdaAleatoria];
            cartas[celdaAleatoria] = tem;
        }
    }
    public void repartir(Jugador player){
        int cantRepartida = 5;
        Carta [] baraja = new Carta [45];
        this.posSiguienteCarta += cantRepartida;
        int k = 0;
        for(int i = posSiguienteCarta-cantRepartida; i < posSiguienteCarta; i++){
            baraja[k] = cartas[i];
            k++;
        }
        player.baraja = baraja;
        player.setPosSiguiente(k);
    }

    public void comeDos(Jugador player){
        int cantRepartida = 2;
        this.posSiguienteCarta += cantRepartida;
        int k = player.posSiguienteCarta;
        for(int i = posSiguienteCarta-cantRepartida; i < posSiguienteCarta; i++){
            player.baraja[k] = cartas[i];
            k++;
        }
        player.setPosSiguiente(k);
    }
    
    public void buscarCementerio(Carta [] cementerio){
        String [] stringCementerio = new String [cementerio.length];
        for(int i = 0; i < cementerio.length; i++){
            if(cementerio[i] != null){
                stringCementerio[i] = cementerio[i].getNombreCarta();
                System.out.println("Cementerio " + stringCementerio[i]);
            }else{
                break;
            }
        }
        String resp1 = (String)JOptionPane.showInputDialog(null, "Seleccione una carta a recuperar", "Buscar", JOptionPane.DEFAULT_OPTION, null, stringCementerio, stringCementerio[0]);
        System.out.println(resp1);
    }
    
    public Carta darSiguienteCarta(){
        Carta k = null;
        if(posSiguienteCarta == 73){
            JOptionPane.showMessageDialog(null, "No hay mas cartas, dele vuelta al mazo", " ", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            k = cartas [posSiguienteCarta];
            posSiguienteCarta++;
        }
        cartas[posSiguienteCarta-1].imprimir();
        return k;
    }
}