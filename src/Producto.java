public class Producto {
  private  String tipo;
    private Integer cantidad;
    private Double precioUnidad;

    public Producto (){
    }

    public Producto(String tipo, Integer cantidad, Double precioUnidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnidad=" + precioUnidad +
                '}';
    }
}
