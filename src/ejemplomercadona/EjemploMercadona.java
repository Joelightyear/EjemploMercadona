package ejemplomercadona;

import java.util.ArrayList;

public class EjemploMercadona {

    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Producto> productos = new ArrayList<>();

    public static void rellenarDatos() {

        Producto p;
        Bebida b;
        ProductoCaduca pc;
        BebidaAlcoholica ba;
        Empleado e;

        for (int i = 0; i < 10; i++) {
            p = new Producto();
            p.setCodigo("COD. PRODUCTO" + i);
            p.setPeso(2.5 + i);
            p.setNombre("PRODUCTO " + i);
            productos.add(p);

            pc = new ProductoCaduca();
            pc.setCodigo("COD. PRODUCTOS CADU." + i);
            pc.setNombre("PRODUCTO CADU." + i);
            pc.setPeso(2.5 + i);
            pc.setFecha_caducidad("Miércoles " + i);
            productos.add(pc);

            b = new Bebida();
            b.setAzucar(i + 6);
            b.setNombre("PRODUCTO BEBIDA " + i);
            b.setPeso(2.5 + i);
            b.setFecha_caducidad("Jueves " + i);
            b.setCodigo("COD. BEBIDA" + i);
            productos.add(b);

            ba = new BebidaAlcoholica();
            ba.setAzucar(i + 7);
            ba.setNombre("PRODUCTO BEBIDA ALCOH." + i);
            ba.setPeso(2.5 + i);
            ba.setCodigo("COD. BEBIDA ALCOH." + i);
            ba.setFecha_caducidad("Viernes " + i);
            ba.setGraduacion(10.5 + i);
            productos.add(ba);

            e = new Empleado();
            e.setNombre("Joel " + i);
            e.setEdad(24 + i);
            empleados.add(e);
        }
    }

    public static void mostrarTodosLosProductos() {
        
        // 1) Forma de hacerlo
        for (int i = 0; i < 10; i++) {
            for (Producto producto : productos) {
                System.out.println(producto.getCodigo());
            }
        }
        /*
        // 2) Forma de hacerlo
        for (Producto producto : productos) {
            producto.mostrar();              //--> Ir a la clase Producto
        }
        System.out.println();
        */
    }

    public static void mostrarTodasLasBebidas() {

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida) {
                System.out.println(((Bebida) productos.get(i)).getAzucar());
            }
        }
    }

    public static void mostrarAzucarBebidaNoAlcoholica() {
        
        // 1 ) Forma de hacerlo
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida){  
                if (!(productos.get(i) instanceof BebidaAlcoholica)) {
                    System.out.println(((Bebida) productos.get(i)).getAzucar());
                }
            }
        }
        // 2) Forma de hacerlo
        /*for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida) && (!(productos.get(i) instanceof BebidaAlcoholica))){
                System.out.println = ((((Bebida) productos.get(i)).getAzucar());
                
            }            
        }
        */
    }

    public static void mostrarMediaGraduacionBebida() {

        double suma = 0;
        int elementos = 0;
        
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof BebidaAlcoholica) {
                suma = suma + ((BebidaAlcoholica)productos.get(i)).getGraduacion();
                elementos++;     
            }           
        }  
        System.out.println(suma / elementos);
    }

    public static void main(String[] args) {
        rellenarDatos();

        //mostrarTodosLosProductos();
        //mostrarTodasLasBebidas();
        //mostrarAzucarBebidaNoAlcoholica();
        mostrarMediaGraduacionBebida();
    }

}
