package com.example.dddshowcase.resource.infrastructure.rest;

import com.example.dddshowcase.resource.application.FindAllResourceOwnerApi;
import com.example.dddshowcase.resource.domain.model.ResourceOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/resourceOwner")
public class ResourceOwnerController {

    @Autowired
    FindAllResourceOwnerApi findAllResourceOwnerApi;

    @GetMapping
    List<ResourceOwner> findAllResourceOwner() {
        return findAllResourceOwnerApi.findAll();
    }

}
