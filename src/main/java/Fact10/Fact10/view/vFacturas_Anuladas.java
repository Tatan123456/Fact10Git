
package Fact10.Fact10.view;

import Fact10.Fact10.model.mFacturas_Anuladas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface vFacturas_Anuladas extends CrudRepository<mFacturas_Anuladas, Integer>{
    
}
