import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

    private static ArrayList<Producto>listaProductos;

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }
    public Producto CrearProducto(String producto, Integer cantidad, Double precioUnidad){
        Producto productoNuevo = new Producto(producto, cantidad, precioUnidad);
        return productoNuevo;

    }
    public ArrayList<Producto> agregarProducto() {
        String fin= "";

    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Ingrese el nombre del producto: ");
       String nombre=sc.next();
       System.out.println("Ingrese la cantidad del producto: ");
       Integer cantidad=sc.nextInt();
       System.out.println("Ingrese el precio del producto: ");
       Double precioUnidad=sc.nextDouble();

       listaProductos.add(CrearProducto(nombre, cantidad, precioUnidad));

       System.out.println("�� Si Desea agregar otro producto digite S, de lo contrario cualquier tecla");
        fin = sc.next();

    } while(fin.equalsIgnoreCase("S"));
    return listaProductos;
}
public static void VerListado(){
        for (Producto i: listaProductos) {
            System.out.println(i);

        }
}
public void ProductoMayorPrecio(){
        for (Producto i: listaProductos) {
            if (i.getPrecioUnidad() >= 20){
                System.out.println(i);

            }
        }
}
public void ProductoMenorPrecio(){
        for (Producto i: listaProductos) {
            if(i.getPrecioUnidad() < 20){
                System.out.println(i);
            }
        }
}
}

