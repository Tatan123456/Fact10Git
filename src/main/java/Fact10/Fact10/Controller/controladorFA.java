
package Fact10.Fact10.Controller;


import Fact10.Fact10.InterfaceService.ISFacturas_Anuladas;
import Fact10.Fact10.model.mFacturas_Anuladas;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class controladorFA {
    
    @Autowired
    private ISFacturas_Anuladas servic;
    
    
    @GetMapping("/listarFA")
    public String listarFA(Model model) {
        List<mFacturas_Anuladas> mFacturas_Anulada = servic.listarFA();
        model.addAttribute("mFacturas_Anulada", mFacturas_Anulada);
        return "FacturasAnuladasT";
    }
    
    @GetMapping("/newFA")
    public String agregarFA(Model model) {
        model.addAttribute("mFacturas_Anuladas", new mFacturas_Anuladas());
        return "ingresarFacturasAnuladas";
    }
    
    @PostMapping("/saveFA")
    public String saveFA(mFacturas_Anuladas mFA, Model model) {
        servic.saveFA(mFA);
        return "redirect:/listarFA";
    }
    
    @GetMapping("/editarFA/{N_Factura}")
    public String editarFA(@PathVariable int N_Factura, Model model) {
        Optional<mFacturas_Anuladas> mFacturas_Anulada = servic.listarIdFA(N_Factura);
        model.addAttribute("mFacturas_Anuladas", mFacturas_Anulada);
        return "ingresarFacturasAnuladas";
    }
    
    
    @GetMapping("/eliminarFA/{N_Factura}")
    public String deleteFA(Model model, @PathVariable int N_Factura){
        servic.deleteFA(N_Factura);
        return "redirect:/listarFA";
    }
    
}
