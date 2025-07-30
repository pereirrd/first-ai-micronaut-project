package com.ai.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.serde.annotation.Serdeable;
import java.time.LocalDateTime;

@Serdeable
public record PingPong(
    @JsonProperty("ping") LocalDateTime ping,
    @JsonProperty("pong") LocalDateTime pong
) {
}