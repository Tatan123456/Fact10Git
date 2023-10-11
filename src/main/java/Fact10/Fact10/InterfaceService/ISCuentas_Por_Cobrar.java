
package Fact10.Fact10.InterfaceService;

import Fact10.Fact10.model.mCuentas_Por_Cobrar;
import java.util.List;
import java.util.Optional;


public interface ISCuentas_Por_Cobrar {
    
    public List<mCuentas_Por_Cobrar>listarCC();
    
     public Optional<mCuentas_Por_Cobrar>listarIdCC(int N_Factura);
     
     public int saveCC(mCuentas_Por_Cobrar mCC);
     
     public void deleteCC(int N_Factura);
}
