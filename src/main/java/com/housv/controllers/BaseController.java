package com.housv.controllers;

import com.housv.domains.dtos.IdDTO;
import com.housv.domains.entities.BaseEntity;
import com.housv.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

public abstract class BaseController<T extends BaseEntity, DTO extends IdDTO, ID extends Serializable> {

    @Autowired
    public abstract BaseService<T, DTO, ID> getService();

    @GetMapping("/all")
    public ResponseEntity<?> all() {
        List<T> models = getService().findAll();
        return new ResponseEntity<Object>(models, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody DTO dto) {
        T model = getService().save(dto);
        return new ResponseEntity<Object>(model, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@Valid @RequestBody DTO dto) {
        T model = getService().update(dto);
        return new ResponseEntity<Object>(model, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable ID id) {
        getService().delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<?> view(@PathVariable ID id) {
        T model = getService().findById(id);
        return new ResponseEntity<Object>(model, HttpStatus.OK);
    }

}
