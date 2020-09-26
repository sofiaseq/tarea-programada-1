public class MazoTest{
    
    public static void main (String args[]){
        Mazo mazo = new Mazo();
        
        mazo.revolver();
        mazo.imprimir();
        System.out.println();
        //mazo.repartir(mazoJuego);
        mazo.darSiguienteCarta();
        mazo.darSiguienteCarta();
        mazo.darSiguienteCarta();
    }
}