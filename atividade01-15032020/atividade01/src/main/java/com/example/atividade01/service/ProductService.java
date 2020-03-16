package com.example.atividade01.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.atividade01.model.Product;
import com.example.atividade01.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    public Product getProdutoById(Integer id)
    {
        Product prod = pr.getProdutoById(id);

        if (prod != null)
        {
            if (!prod.getCode().equals(id))
            {
                prod = null;
            }

        }

        return prod;
    }

    public ArrayList<Product> getProdutos() 
    {
        ArrayList<Product> list = new ArrayList<Product>();
        HashMap <Integer,Product> pdt = pr.getHashMap();

        
        for (Product prod : pdt.values()) {

            if (prod.getStock() > 0)
            {
                list.add(prod);
            }
            
        }
        
        return list;
    }

    public ArrayList<Product> getProdutosByValorAcima(double valor)
    {
        ArrayList<Product> list = new ArrayList<Product>();
        HashMap <Integer,Product> pdt = pr.getHashMap();

        
        for (Product prod : pdt.values()) {

            if (prod.getValue() > valor)
            {
                list.add(prod);
            }
            
        }
        
        return list;
    }

    public ArrayList<Product> getProdutosByValorAbaixo(double valor)
    {
        ArrayList<Product> list = new ArrayList<Product>();
        HashMap <Integer,Product> pdt = pr.getHashMap();

        for (Product prod : pdt.values()) {
            
            if (prod.getValue() < valor)
            {
                list.add(prod);
            }
            
        }
        
        return list;
    }


    
}