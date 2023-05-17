package com.example.dddshowcase.resources.application;

import com.example.dddshowcase.resources.domain.model.ResourceReferential;
import com.example.dddshowcase.resources.domain.model.ResourceReferentialRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class UploadResourceReferentialApi {

    @Autowired
    ResourceReferentialRepository repository;

    @Transactional
    public void createDummyResourceReferentials() {
        var resources = List.of(
                new ResourceReferential(UUID.randomUUID(), "resource A"),
                new ResourceReferential(UUID.randomUUID(), "resource B"),
                new ResourceReferential(UUID.randomUUID(), "resource C")
        );

        repository.saveAll(resources);

        resources.forEach(resource -> log.info("Saved resource %s".formatted(resource.getId().toString())));
    }

}
