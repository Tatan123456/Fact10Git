
package Fact10.Fact10.service;

import Fact10.Fact10.InterfaceService.ISDevoluciones;
import Fact10.Fact10.model.mDevoluciones;
import Fact10.Fact10.view.vDevoluciones;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class sDevoluciones implements ISDevoluciones{
    
    
    @Autowired
    private vDevoluciones vD;
    

    @Override
    public List<mDevoluciones> listar() {
       return(List<mDevoluciones>)vD.findAll();
    }

    
    
    @Override
    public Optional<mDevoluciones> listarId(int N_Factura) {
    return vD.findById(N_Factura);    
    }

    @Override
    public int save(mDevoluciones mD) {
        int res=0;
        mDevoluciones mDevolu=vD.save(mD);
        if(!mDevolu.equals(null)){
            res=1;
        }
        return res;
    } 

    @Override
    public void delete(int N_Factura) {
      vD.deleteById(N_Factura);  
    }
    

    
    
}
