package com.example.atividade01.repository;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.atividade01.model.Product;

import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public class ProductRepository {

    public HashMap <Integer,Product> hm = new HashMap<Integer,Product>();

    public ProductRepository ()
    {
        hm.put(1, new Product(1, "Drive Óptico", 60, 15));
        hm.put(2, new Product(2, "Gabinete", 208.35, 30));
        hm.put(3, new Product(3, "HD 2TB", 150, 28));
        hm.put(4, new Product(4, "Memória Ram 8 GB", 300.55, 10));
        hm.put(5, new Product(5, "Mouse ", 50.90, 5));
        hm.put(6, new Product(6, "Placa de Vídeo 2GB", 800.99, 7));
        hm.put(7, new Product(7, "Placa-mãe", 500.80, 6));
        hm.put(8, new Product(8, "Processador", 200.77, 11));
        hm.put(9, new Product(9, "SSD 1TB", 1000.90, 22));
        hm.put(10, new Product(10, "Teclado", 80.80, 17));

        
    }

    public HashMap <Integer,Product> getHashMap ()
    {
        return this.hm;
    }


    public Product getProdutoById(Integer id)
    {
        return hm.get(id);
    }
    
    public ArrayList<Product> getProdutos() 
    {
        ArrayList<Product> list = new ArrayList<Product>();
        
        return list;
    }

}