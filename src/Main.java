public class Main {
    public static void main(String[] args) {

        ProductoServicio servicio = new ProductoServicio();
        servicio.agregarProducto();
        System.out.println("Productos Cargados: ");
        servicio.VerListado();

        System.out.println("\n"+  "Listado de productos Mayores a $20");
        servicio.ProductoMayorPrecio();

        System.out.println("\n"+  "Listado de productos Menores a $20");
        servicio.ProductoMenorPrecio();
    }
}