
package ejemplomercadona;


public class ProductoCaduca extends Producto{
    
    private String fecha_caducidad;

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.fecha_caducidad);
    }
}
