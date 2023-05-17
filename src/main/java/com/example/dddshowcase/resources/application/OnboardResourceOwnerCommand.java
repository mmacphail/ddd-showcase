package com.example.dddshowcase.resources.application;

import lombok.Data;

import java.util.UUID;

@Data
public class OnboardResourceOwnerCommand {
    private final UUID resourceId;
    private final UUID userId;
}
