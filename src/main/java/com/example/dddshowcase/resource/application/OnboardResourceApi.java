package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.OnboardedResourceEvent;
import com.example.dddshowcase.resource.domain.model.ResourceReferentialRepository;
import com.example.dddshowcase.resource.domain.model.ResourceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OnboardResourceApi {

    @Autowired
    ResourceReferentialRepository resourceReferentialRepository;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Transactional
    public void onboardResource(OnboardResourceCommand command) {
        var resourceReferential = resourceReferentialRepository.getReferenceById(command.resourceReferentialId);
        var resource = resourceReferential.onboard();
        resourceRepository.save(resource);

        eventPublisher.publishEvent(new OnboardedResourceEvent(resource.getId(), LocalDateTime.now()));
    }

}
