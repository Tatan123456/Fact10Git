
package Fact10.Fact10.service;

import Fact10.Fact10.InterfaceService.ISCuentas_Por_Cobrar;
import Fact10.Fact10.model.mCuentas_Por_Cobrar;
import Fact10.Fact10.view.vCuentas_Por_Cobrar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class sCuentas_Por_Cobrar implements ISCuentas_Por_Cobrar{
    
    @Autowired
    private vCuentas_Por_Cobrar vCC;

    @Override
    public List<mCuentas_Por_Cobrar> listarCC() {
        return(List<mCuentas_Por_Cobrar>)vCC.findAll();
    }

    @Override
    public Optional<mCuentas_Por_Cobrar> listarIdCC(int N_Factura) {
        return vCC.findById(N_Factura);
    }

    
    @Override
    public int saveCC(mCuentas_Por_Cobrar mCC) {
       
        int res=0;
        mCuentas_Por_Cobrar mCuentas_Por_Cobra=vCC.save(mCC);
        if(!mCuentas_Por_Cobra.equals(null)){
            res=1;
        }
        return res;
    }

    
    @Override
    public void deleteCC(int N_Factura) {
          vCC.deleteById(N_Factura);
    }
 
}
