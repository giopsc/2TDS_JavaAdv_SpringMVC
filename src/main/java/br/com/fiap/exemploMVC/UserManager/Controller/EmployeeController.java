package br.com.fiap.exemploMVC.UserManager.Controller;

import br.com.fiap.exemploMVC.UserManager.DomainModel.Employee;
import br.com.fiap.exemploMVC.UserManager.Service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class EmployeeController {

    private @Setter EmployeeService service;

    @GetMapping("/addNew")
    public String addNewEmployee( Model model ){
        Employee emp = new Employee();
        model.addAttribute( "employee", emp);
        return "newEmployee";
    }

    @PostMapping("/save")
    public String saveEmployee ( @ModelAttribute("employee") Employee employee ){
        this.service.save( employee );
        return "redirect:/";
    }
    // DTO é para ser usado como exceção, pois é para passar informações resumidas, quando é para passar toda a informação, não se utiliza

}
