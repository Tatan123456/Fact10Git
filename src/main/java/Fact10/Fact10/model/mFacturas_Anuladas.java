
package Fact10.Fact10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Facturas_Anuladas")

public class mFacturas_Anuladas {
    
      @Id
      
      // @GeneratedValue(strategy=GenerationType.IDENTITY)  este es para autoincremental el ID
      
      private int N_Factura;
        private String Motivo_Anulacion;
        private String Items_Anulados;
        private String Fecha_Anulacion;
        private String Fecha_Pago;

    public mFacturas_Anuladas() {
    }

    
    public mFacturas_Anuladas(int N_Factura, String Motivo_Anulacion, String Items_Anulados, String Fecha_Anulacion, String Fecha_Pago) {
        this.N_Factura = N_Factura;
        this.Motivo_Anulacion = Motivo_Anulacion;
        this.Items_Anulados = Items_Anulados;
        this.Fecha_Anulacion = Fecha_Anulacion;
        this.Fecha_Pago = Fecha_Pago;
    }

    public int getN_Factura() {
        return N_Factura;
    }

    public void setN_Factura(int N_Factura) {
        this.N_Factura = N_Factura;
    }

    public String getMotivo_Anulacion() {
        return Motivo_Anulacion;
    }

    public void setMotivo_Anulacion(String Motivo_Anulacion) {
        this.Motivo_Anulacion = Motivo_Anulacion;
    }

    public String getItems_Anulados() {
        return Items_Anulados;
    }

    public void setItems_Anulados(String Items_Anulados) {
        this.Items_Anulados = Items_Anulados;
    }

    public String getFecha_Anulacion() {
        return Fecha_Anulacion;
    }

    public void setFecha_Anulacion(String Fecha_Anulacion) {
        this.Fecha_Anulacion = Fecha_Anulacion;
    }

    public String getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(String Fecha_Pago) {
        this.Fecha_Pago = Fecha_Pago;
    }
        
    
    
}
