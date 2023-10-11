
package Fact10.Fact10.Controller;

import Fact10.Fact10.InterfaceService.ISCuentas_Por_Cobrar;
import Fact10.Fact10.model.mCuentas_Por_Cobrar;
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


public class controladorCC {
    
    @Autowired
    private ISCuentas_Por_Cobrar service;
    
    
    @GetMapping("/listarCC")
    public String listarCC(Model model) {
        List<mCuentas_Por_Cobrar> mCuentas_Por_Cobra = service.listarCC();
        model.addAttribute("mCuentas_Por_Cobra", mCuentas_Por_Cobra);
        return "CuentasPorCobrarT";
    }
    
    @GetMapping("/newCC")
    public String agregarCC(Model model) {
        model.addAttribute("mCuentas_Por_Cobrar", new mCuentas_Por_Cobrar());
        return "ingresarCuentas_Por_Cobrar";
    }
    
    @PostMapping("/saveCC")
    public String saveCC(mCuentas_Por_Cobrar mCC, Model model) {
        service.saveCC(mCC);
        return "redirect:/listarCC";
    }
    
    @GetMapping("/editarCC/{N_Factura}")
    public String editarCC(@PathVariable int N_Factura, Model model) {
        Optional<mCuentas_Por_Cobrar> mCuentas_Por_Cobra = service.listarIdCC(N_Factura);
        model.addAttribute("mCuentas_Por_Cobrar", mCuentas_Por_Cobra);
        return "ingresarCuentas_Por_Cobrar";
    }
    
    
    @GetMapping("/eliminarCC/{N_Factura}")
    public String deleteCC(Model model, @PathVariable int N_Factura){
        service.deleteCC(N_Factura);
        return "redirect:/listarCC";
    }
}
