package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.ResourceReferential;
import com.example.dddshowcase.resource.domain.model.ResourceReferentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllResourceReferentials {

    @Autowired
    ResourceReferentialRepository repository;

    public List<ResourceReferential> findAll() {
        return repository.findAll();
    }

}
