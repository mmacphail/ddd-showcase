package com.example.dddshowcase.resource.infrastructure.rest;

import com.example.dddshowcase.resource.application.FindAllResourceReferentials;
import com.example.dddshowcase.resource.application.OnboardResourceApi;
import com.example.dddshowcase.resource.application.OnboardResourceCommand;
import com.example.dddshowcase.resource.application.UploadResourceReferentialApi;
import com.example.dddshowcase.resource.domain.model.ResourceReferential;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/resourceReferential")
public class ResourceReferentialController {

    @Autowired
    OnboardResourceApi onboardResourceApi;

    @Autowired
    UploadResourceReferentialApi uploadResourceReferentialApi;

    @Autowired
    FindAllResourceReferentials findAllResourceReferentialsApi;

    @PostConstruct
    void insertDefaultResources() {
        uploadResourceReferentialApi.createDummyResourceReferentials();
    }

    @PostMapping("/{id}/onboard")
    void onboard(@PathVariable("id") UUID id) {
        var command = OnboardResourceCommand.builder()
                .resourceReferentialId(id)
                .build();
        onboardResourceApi.onboardResource(command);
    }

    @GetMapping
    List<ResourceReferential> findAllResourceReferentials() {
        return findAllResourceReferentialsApi.findAll();
    }

}
