
package Fact10.Fact10.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="devoluciones")

public class mDevoluciones {
    
    @Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)   
    
    
        private int N_Factura;   

        @Column()    
        private String Fecha_Devolucion;
        private String Motivo_Devolucion;
        

        
        //Para realizar el listado desplegable
    @ManyToOne
    @JoinColumn(name="N_devolucio")
    private mCuentas_Por_Cobrar N_Devolucion;//mTipoPersona es el nombre de la clase
    
        
        public mDevoluciones() {
            }
        

    public mDevoluciones(int N_Factura, mCuentas_Por_Cobrar N_Devolucion, String Fecha_Devolucion, String Motivo_Devolucion) {
        this.N_Factura = N_Factura;       
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Motivo_Devolucion = Motivo_Devolucion;
        this.N_Devolucion = N_Devolucion;
        
    }

   
        
        

    public int getN_Factura() {
        return N_Factura;
    }

    public void setN_Factura(int N_Factura) {
        this.N_Factura = N_Factura;
    }


    public String getFecha_Devolucion() {
        return Fecha_Devolucion;
    }

    public void setFecha_Devolucion(String Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public String getMotivo_Devolucion() {
        return Motivo_Devolucion;
    }

    public void setMotivo_Devolucion(String Motivo_Devolucion) {
        this.Motivo_Devolucion = Motivo_Devolucion;
    }

    public mCuentas_Por_Cobrar getN_Devolucion() {
        return N_Devolucion;
    }

    public void setN_Devolucion(mCuentas_Por_Cobrar N_Devolucion) {
        this.N_Devolucion = N_Devolucion;
    }
        
      
    
}
