public class Carta{
    private String color;
    private int simbolo;
    private boolean especial;

    public void setColor(String colorParametro){
        color = colorParametro;
    }
    public void setSimbolo(int simboloParametro){
        simbolo = simboloParametro;
    }
    
    public String getColor(){
        return color;
    }
    public int getSimbolo(){
        return simbolo;
    }

    public String getNombreCarta(){
        return convertirSimbolo() + " " + color;
    }
    
    public String convertirSimbolo(){
        String resultado = "";
        switch(simbolo){
            case 8: 
                resultado = "+2";
            break;
            case 9:
                resultado = "cancelar";
            break;
            case 10:
                resultado = "buscar";
            break;
            default: 
                resultado = resultado + simbolo;
        }
        return resultado;
    }
    
    public Carta (int simboloParametro, String colorParametro){
        this.simbolo = simboloParametro;
        this.color = colorParametro;
        this.especial = especial;
    }
    
     public void imprimir(){
       System.out.println(convertirSimbolo() + " " + color);
    }
}