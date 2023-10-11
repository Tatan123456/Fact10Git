
package Fact10.Fact10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="cuentas_por_cobrar")

public class mCuentas_Por_Cobrar {
    
    @Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int N_Factura;
        private String N_De_Cuenta;
        private String Detalle;
        private String Valor_De_Item;
        private String Forma_De_Pago;
        private String Total_A_Pagar;
        
        

    public mCuentas_Por_Cobrar() {
    }

    public mCuentas_Por_Cobrar(int N_Factura, String N_De_Cuenta, String Detalle, String Valor_De_Item, String Forma_De_Pago, String Total_A_Pagar) {
        this.N_Factura = N_Factura;
        this.N_De_Cuenta = N_De_Cuenta;
        this.Detalle = Detalle;
        this.Valor_De_Item = Valor_De_Item;
        this.Forma_De_Pago = Forma_De_Pago;
        this.Total_A_Pagar = Total_A_Pagar;
    }

    public int getN_Factura() {
        return N_Factura;
    }

    public void setN_Factura(int N_Factura) {
        this.N_Factura = N_Factura;
    }

    public String getN_De_Cuenta() {
        return N_De_Cuenta;
    }

    public void setN_De_Cuenta(String N_De_Cuenta) {
        this.N_De_Cuenta = N_De_Cuenta;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public String getValor_De_Item() {
        return Valor_De_Item;
    }

    public void setValor_De_Item(String Valor_De_Item) {
        this.Valor_De_Item = Valor_De_Item;
    }

    public String getForma_De_Pago() {
        return Forma_De_Pago;
    }

    public void setForma_De_Pago(String Forma_De_Pago) {
        this.Forma_De_Pago = Forma_De_Pago;
    }

    public String getTotal_A_Pagar() {
        return Total_A_Pagar;
    }

    public void setTotal_A_Pagar(String Total_A_Pagar) {
        this.Total_A_Pagar = Total_A_Pagar;
    }
        
    
    
        
        
}
