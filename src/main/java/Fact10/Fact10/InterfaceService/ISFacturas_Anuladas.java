
package Fact10.Fact10.InterfaceService;


import Fact10.Fact10.model.mFacturas_Anuladas;
import java.util.List;
import java.util.Optional;


public interface ISFacturas_Anuladas {
    
    public List<mFacturas_Anuladas>listarFA();
    
     public Optional<mFacturas_Anuladas>listarIdFA(int N_Factura);
     
     public int saveFA(mFacturas_Anuladas mFA);
     
     public void deleteFA(int N_Factura);
    
}
