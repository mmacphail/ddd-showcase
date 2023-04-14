package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.ResourceReferentialRepository;
import com.example.dddshowcase.resource.domain.model.ResourceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OnboardResourceApi {

    @Autowired
    ResourceReferentialRepository resourceReferentialRepository;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    OnboardResourceOwnerApi onboardResourceOwnerApi;

    @Transactional
    public void onboardResource(OnboardResourceCommand command) {
        var resourceReferential = resourceReferentialRepository.getReferenceById(command.resourceReferentialId);
        var resource = resourceReferential.onboard();
        resourceRepository.save(resource);

        OnboardResourceOwnerCommand oroCommand = new OnboardResourceOwnerCommand(resource.getId(), resourceReferential.getDefaultResourceOwner());
        onboardResourceOwnerApi.onboardResourceOwner(oroCommand);
    }

}
