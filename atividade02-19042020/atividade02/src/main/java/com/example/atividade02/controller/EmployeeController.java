package com.example.atividade02.controller;

import com.example.atividade02.entidade.Employee;
import com.example.atividade02.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    //Devolve todos os funcionarios para o template
    @GetMapping("/funcionarios")
    public ModelAndView getEmployee ()
    {
        ModelAndView mv = new ModelAndView("FuncionariosTemplates");

        mv.addObject("funcionarios", service.getEmployee());

        return mv;
    }

    @PostMapping("/salvar")
    public String insert (@ModelAttribute Employee employee)
    {
        service.insert(employee);

        return "redirect:/funcionarios";
    }
}