package com.example.dddshowcase.resource.application;

import com.example.dddshowcase.resource.domain.model.ResourceOwner;
import com.example.dddshowcase.resource.domain.model.ResourceOwnerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OnboardResourceOwnerApi {

    @Autowired
    ResourceOwnerRepository repository;

    @Transactional
    public void onboardResourceOwner(OnboardResourceOwnerCommand command) {
        var resourceOwner = ResourceOwner.createNew(command.getResourceId(), command.getUserId());
        repository.save(resourceOwner);
    }

}
