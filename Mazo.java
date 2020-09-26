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
    public void repartir(String [] mazo){
        int cantRepartida = 5;
        String [] baraja = new String [45];
        posSiguienteCarta += cantRepartida;
        
        for(int i = 0; i < cantRepartida +1; i++){
            int k = 0;
            baraja[k] = mazo[i];
            k++;
        }
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