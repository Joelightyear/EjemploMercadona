
package ejemplomercadona;


public class BebidaAlcoholica extends Bebida {
    
    private double graduacion;

    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }
          
    public void mostrar(){
        super.mostrar();
        System.out.println(this.graduacion);
    }
    
}
