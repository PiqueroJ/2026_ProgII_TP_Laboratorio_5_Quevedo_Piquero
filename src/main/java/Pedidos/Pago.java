package Pedidos;

import java.util.Date;

public class Pago {
    private int idPago;
    private double monto;
    private Date fechaPago;

    public Pago(int idPago, double monto, Date fechaPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", monto=" + monto + ", fechaPago=" + fechaPago + '}';
    }
    
    
    
    public boolean procesarPago(){
        return true;
    }
    
    public void emitirComprobante(){
        
    }
}
