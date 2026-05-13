
package Cliente;


public class ClientePreferencial extends Cliente {
    private double porcentajeDescuento;
    private int puntosAcumulados;

    public ClientePreferencial(double porcentajeDescuento, int puntosAcumulados, int idCliente, String nombre, String apellido, String email, String direccion, String instagram, String facebook) {
        super(idCliente, nombre, apellido, email, direccion, instagram, facebook);
        this.porcentajeDescuento = porcentajeDescuento;
        this.puntosAcumulados = puntosAcumulados;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    @Override
    public String toString() {
        return "ClientePreferencial{" + "porcentajeDescuento=" + porcentajeDescuento + ", puntosAcumulados=" + puntosAcumulados + '}';
    }
    
    public double porcentajeDescuento(){
     return 0;
     }
    
    public void acumularPuntos(){
        
    }
    
    public void canjearBeneficios(){
        
    }
    
}
