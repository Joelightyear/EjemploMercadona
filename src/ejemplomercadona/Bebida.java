
package ejemplomercadona;


public class Bebida extends ProductoCaduca{
    
    private double azucar;

    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(this.azucar);
       
    }
    
    
}
