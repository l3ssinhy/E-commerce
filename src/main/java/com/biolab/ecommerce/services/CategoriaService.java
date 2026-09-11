package com.biolab.ecommerce.services;

import com.biolab.ecommerce.DTOs.CategoriaDTO;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public String criarCategoria(CategoriaDTO dto){
        Categoria categoria = new Categoria();
        categoria.setNome(dto.getNome());
        categoriaRepository.save(categoria);
        return "Categoria crida com sucesso";
    }

    public CategoriaDTO buscarCatId(long id){
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        CategoriaDTO dto = new CategoriaDTO();
        dto.setId(categoria.getId());
        dto.setNome(categoria.getNome());
        return dto;
    }

    public String delete(long id){
        categoriaRepository.deleteById(id);
        return "Exclido com sucesso bro";
    }
}
