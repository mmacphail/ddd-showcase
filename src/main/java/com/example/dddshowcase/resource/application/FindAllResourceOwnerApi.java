package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.ResourceOwner;
import com.example.dddshowcase.resource.domain.model.ResourceOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllResourceOwnerApi {

    @Autowired
    ResourceOwnerRepository repository;

    public List<ResourceOwner> findAll() {
        return repository.findAll();
    }

}
