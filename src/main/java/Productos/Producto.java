package Productos;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private double valorCosto;
    private int stock;
    private double graduacionAlcoholica;

    public Producto(int idProducto, String nombre, double precio, double valorCosto, int stock, double graduacionAlcoholica) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.valorCosto = valorCosto;
        this.stock = stock;
        this.graduacionAlcoholica = graduacionAlcoholica;
    }
    
    public void actualizarStock(int cantidad){
        
    }
    
    public boolean verificarStock(int cantidad){
     return true;   
    }
    
    public double calcularGanancia(){
        return 0;
    }
    
}
