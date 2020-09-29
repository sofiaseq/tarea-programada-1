public class Cementerio{
  public Carta[] pilaDeDescarte;
  public int posSiguienteCarta = 0;
   
  public Cementerio(){
      this.pilaDeDescarte = new Carta[45];
  }
  
  public String mostrarUltimaCarta(Carta[] baraja){
        String ultimaCarta = "La ultima carta jugada es ";
        for(int i = 0; i < baraja.length; i++){
        if(baraja[i] == null){
            ultimaCarta += baraja[i-1].getNombreCarta();
            break;
        }        
    }
    return ultimaCarta;
   }
   
   public String ultimaCartaColor(Carta[] baraja){
        String colorUltimaCarta = "";
        for(int i = 0; i < baraja.length; i++){
            if(baraja[i] == null){
            colorUltimaCarta = baraja[i-1].getColor();
            break;
        }
       }
         return colorUltimaCarta;
   }
   
   public int ultimaCartaSimbolo(Carta[] baraja){
        int simboloUltimaCarta = 0;
        for(int i = 0; i < baraja.length; i++){
            if(baraja[i] == null){
            simboloUltimaCarta = baraja[i-1].getSimbolo();
            break;
           }        
       }
         return simboloUltimaCarta;
   }
   
   public boolean ultimaCartaEspecial(Carta[] baraja){
        boolean especialUltimaCarta = true;
        for(int i = 0; i < baraja.length; i++){
            if(baraja[i] == null){
            especialUltimaCarta = baraja[i-1].getEspecial();
            break;
           }        
       }
         return especialUltimaCarta;
   }
}