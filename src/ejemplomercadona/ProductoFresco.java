
package ejemplomercadona;


public class ProductoFresco extends ProductoCaduca{
    
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }  
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.temperatura);
        
    }
}
