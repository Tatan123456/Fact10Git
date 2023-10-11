
package Fact10.Fact10.service;

import Fact10.Fact10.InterfaceService.ISFacturas_Anuladas;
import Fact10.Fact10.model.mFacturas_Anuladas;
import Fact10.Fact10.view.vFacturas_Anuladas;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class sFacturas_Anuladas implements ISFacturas_Anuladas{
    
    
     @Autowired
    private vFacturas_Anuladas vFA;

    @Override
    public List<mFacturas_Anuladas> listarFA() {
        return(List<mFacturas_Anuladas>)vFA.findAll();
    }

    @Override
    public Optional<mFacturas_Anuladas> listarIdFA(int N_Factura) {
        return vFA.findById(N_Factura);
    }

    
    @Override
    public int saveFA(mFacturas_Anuladas mFA) {
       
        int res=0;
        mFacturas_Anuladas mFacturas_Anulada=vFA.save(mFA);
        if(!mFacturas_Anulada.equals(null)){
            res=1;
        }
        return res;
    }

    
    @Override
    public void deleteFA(int N_Factura) {
          vFA.deleteById(N_Factura);
    }
    
}
