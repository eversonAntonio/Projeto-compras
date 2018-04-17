package br.com.analise.compras.service;

import br.com.analise.compras.Entity.Categoria;
import br.com.analise.compras.exception.ObjectNotFoundException;
import br.com.analise.compras.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscarCategoriaPorId(Integer id){
        Categoria categoria = categoriaRepository.findOne(id);

        if (categoria == null){
            throw new ObjectNotFoundException("O objeto " + Categoria.class.getName() + " com ID: " + id +
                    " não foi encontrado!");
        }

        return categoria;
    }
}
