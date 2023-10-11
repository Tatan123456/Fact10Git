
package Fact10.Fact10.Controller;

import Fact10.Fact10.InterfaceService.ISCuentas_Por_Cobrar;
import Fact10.Fact10.InterfaceService.ISDevoluciones;
import Fact10.Fact10.model.mCuentas_Por_Cobrar;
import Fact10.Fact10.model.mDevoluciones;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping
public class controlador {
    
        
    
    @Autowired
    private ISDevoluciones service;
    
   
    @Autowired
    private ISCuentas_Por_Cobrar services;
    
    
    @GetMapping("/listar")
    public String listar(Model model) {
        List<mDevoluciones> mDevolucion = service.listar();
        model.addAttribute("mDevolucion", mDevolucion);
        return "DevolucionesT";
    }
    
 

 @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("mDevoluciones", new mDevoluciones());
        
        //Para realizar el listado desplegable
        List<mCuentas_Por_Cobrar> mCuentas_Por_Cobra = services.listarCC();
        model.addAttribute("mCuentas_Por_Cobra",mCuentas_Por_Cobra);
        
        
        return "IngresarDevoluciones";
    }
    
    @PostMapping("/save")
    public String save(mDevoluciones mD, Model model) {
        service.save(mD);
        return "redirect:/listar";
    }
    
    @GetMapping("/editar/{N_Factura}")
    public String editar(@PathVariable int N_Factura, Model model) {
        Optional<mDevoluciones> mDevolucion = service.listarId(N_Factura);
        model.addAttribute("mDevoluciones", mDevolucion);
        
        
        List<mCuentas_Por_Cobrar> mCuentas_Por_Cobra = services.listarCC();
        model.addAttribute("mCuentas_Por_Cobra",mCuentas_Por_Cobra);
        
        return "IngresarDevoluciones";
    }
    
    @GetMapping("/eliminar/{N_Factura}")
    public String delete(Model model, @PathVariable int N_Factura){
        service.delete(N_Factura);
        return "redirect:/listar";
    }
}


