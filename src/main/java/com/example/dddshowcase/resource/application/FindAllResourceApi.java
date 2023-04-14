package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.Resource;
import com.example.dddshowcase.resource.domain.model.ResourceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllResourceApi {

    @Autowired
    ResourceRepository repository;

    @Transactional
    public List<Resource> findAll() {
        return repository.findAll();
    }

}
