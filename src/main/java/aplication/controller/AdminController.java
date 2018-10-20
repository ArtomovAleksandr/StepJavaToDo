package aplication.controller;

import aplication.entity.TableToDo;
import aplication.service.implement.ToGoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sun.security.pkcs11.Secmod;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    ToGoService service;
    @GetMapping
    public String getToDo(Model model){
        List<TableToDo> table=null;
        try{
            table=service.getAll();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        model.addAttribute("table",table);
        return "forms/index";
    }
}
