package com.example.dddshowcase.resource.infrastructure.rest;

import com.example.dddshowcase.resource.application.FindAllResourceApi;
import com.example.dddshowcase.resource.domain.model.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/resource")
public class ResourceController {

    @Autowired
    FindAllResourceApi findAllResourceApi;

    @GetMapping
    List<Resource> findAllResource() {
        return findAllResourceApi.findAll();
    }

}
