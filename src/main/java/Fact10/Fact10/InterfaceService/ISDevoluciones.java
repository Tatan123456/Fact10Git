
package Fact10.Fact10.InterfaceService;

import Fact10.Fact10.model.mDevoluciones;
import java.util.List;
import java.util.Optional;


public interface ISDevoluciones {
    
    public List<mDevoluciones>listar();
    public Optional<mDevoluciones>listarId(int N_Factura);
    
    public int save(mDevoluciones mD);
    public void delete(int N_Factura);
}
