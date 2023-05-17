package com.example.dddshowcase.resources.infrastructure;

import com.example.dddshowcase.resources.application.FindAllResourceReferentials;
import com.example.dddshowcase.resources.application.OnboardResourceApi;
import com.example.dddshowcase.resources.application.OnboardResourceCommand;
import com.example.dddshowcase.resources.application.UploadResourceReferentialApi;
import com.example.dddshowcase.resources.domain.model.ResourceReferential;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;
import java.util.List;

@Slf4j
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

    private final Random rng = new Random();

    @GetMapping
    ResponseEntity<List<ResourceReferential>> findAllResourceReferentials() throws InterruptedException {
        if(rng.nextBoolean()) {
            log.info("Working");
            Thread.sleep(500);
            return ResponseEntity.ok(findAllResourceReferentialsApi.findAll());
        } else {
            log.error("Internal server error");
            Thread.sleep(2000);
            return ResponseEntity.internalServerError().build();
        }
    }
}
