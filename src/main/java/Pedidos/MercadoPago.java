package Pedidos;

import java.util.Date;

public class MercadoPago extends Pago {
    private String aliasCuenta;

    public MercadoPago(String aliasCuenta, int idPago, double monto, Date fechaPago) {
        super(idPago, monto, fechaPago);
        this.aliasCuenta = aliasCuenta;
    }
    
    public boolean validarCuenta(){
        return true;
    }
}
