package com.example.dddshowcase.resource.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class OnboardedResourceEvent {
    private final UUID resourceId;
    private final LocalDateTime occurredAt;
}
