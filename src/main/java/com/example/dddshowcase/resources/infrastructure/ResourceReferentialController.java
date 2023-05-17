package com.example.dddshowcase.resources.infrastructure;

import com.example.dddshowcase.resources.application.FindAllResourceReferentials;
import com.example.dddshowcase.resources.application.OnboardResourceApi;
import com.example.dddshowcase.resources.application.OnboardResourceCommand;
import com.example.dddshowcase.resources.application.UploadResourceReferentialApi;
import com.example.dddshowcase.resources.domain.model.ResourceReferential;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.List;

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
        onboardResourceApi.onboardResource(OnboardResourceCommand.builder().resourceReferentialId(id).build());
    }

    @GetMapping
    List<ResourceReferential> findAllResourceReferentials() {
        return findAllResourceReferentialsApi.findAll();
    }
}
