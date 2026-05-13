package Pedidos;

import java.util.Date;


public class TarjetaCredito extends Pago {
    private String numeroTarjeta;
    private String banco;

    public TarjetaCredito(String numeroTarjeta, String banco, int idPago, double monto, Date fechaPago) {
        super(idPago, monto, fechaPago);
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "numeroTarjeta=" + numeroTarjeta + ", banco=" + banco + '}';
    }
    
    public boolean validarTarjeta(){
       return true;
    }
}
