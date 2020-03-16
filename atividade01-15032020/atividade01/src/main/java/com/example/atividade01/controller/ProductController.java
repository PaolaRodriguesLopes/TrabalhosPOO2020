package com.example.atividade01.controller;

import java.util.ArrayList;

import com.example.atividade01.model.Product;
import com.example.atividade01.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */
@Controller
//@RequestMapping("/produto")
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping("/produto/{id}")
    public ModelAndView getProduct (
        @PathVariable ("id") int id
    )
    {
        ModelAndView mv  = new ModelAndView("productView");

        Product product = ps.getProdutoById(id);

        mv.addObject("product", product);

        return mv;
    }

    @GetMapping("/produtosEmEstoque")
    public ModelAndView getProduct ()
    {
        ModelAndView mv  = new ModelAndView("productView");

        ArrayList<Product> product = ps.getProdutos();

        mv.addObject("product", product);

        return mv;
    }

    @GetMapping("/produtosValorAcima/{valor}")
    public ModelAndView getProductByValorAcima (
        @PathVariable ("valor") double valor
    )
    {
        ModelAndView mv  = new ModelAndView("productView");

        ArrayList<Product> product = ps.getProdutosByValorAcima(valor);

        mv.addObject("product", product);

        return mv;
    }

    @GetMapping("/produtosValorAbaixo/{valor}")
    public ModelAndView getProductByValorAbaixo (
        @PathVariable ("valor") double valor
    )
    {
        ModelAndView mv  = new ModelAndView("productView");

        ArrayList<Product> product = ps.getProdutosByValorAbaixo(valor);

        mv.addObject("product", product);

        return mv;
    }
    
}