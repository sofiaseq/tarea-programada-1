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
}