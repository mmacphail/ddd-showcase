package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.*;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OnboardResourceOwnerApi {

    @Autowired
    ResourceOwnerRepository repository;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    ResourceReferentialRepository resourceReferentialRepository;

    @EventListener
    @Transactional
    public void onboardResourceOwner(OnboardedResourceEvent event) {
        log.info("Received event: {}", event);
        var resource = resourceRepository.getReferenceById(event.getResourceId());
        var resourceReferential = resourceReferentialRepository.getReferenceById(resource.getResourceReferentialId());

        var resourceOwner = ResourceOwner.createNew(event.getResourceId(), resourceReferential.getDefaultResourceOwner());
        repository.save(resourceOwner);
    }

}
