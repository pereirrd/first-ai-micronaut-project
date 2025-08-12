package com.ai.services;

import com.ai.model.PingPong;
import jakarta.inject.Singleton;
import java.time.LocalDateTime;

@Singleton
public class PingPongService {

    public PingPong create(LocalDateTime ping) {
        var pong = LocalDateTime.now();
        return new PingPong(ping, pong);
    }
} 