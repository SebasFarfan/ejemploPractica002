package com.ejemplo.tp2.ejemploPractica.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.ejemplo.tp2.ejemploPractica.model.Libro;
import com.ejemplo.tp2.ejemploPractica.service.ILibroService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl implements ILibroService {

    private static final Log LOGGER = LogFactory.getLog(LibroServiceImpl.class);

    private List<Libro> libroList = new ArrayList<Libro>();

    @Override
    public void agregarLibro(Libro libro) {
        // agrego un libro en la lista de libros
        libroList.add(libro);
        LOGGER.info("METHOD: agregarLibro - se agrego un objeto libro en la lista --> " +  libroList.get(libroList.size()-1));
        
    }
    
}
