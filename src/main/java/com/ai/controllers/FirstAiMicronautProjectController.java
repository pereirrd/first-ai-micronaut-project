package com.ai.controllers;

import com.ai.model.PingPong;
import com.ai.services.PingPongService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;

@Controller("/first-ai-micronaut-project")
@RequiredArgsConstructor
public class FirstAiMicronautProjectController {

    private final PingPongService pingPongService;

    @Get(uri="/ping", produces="application/json")
    public HttpResponse<PingPong> ping() {
        var ping = LocalDateTime.now();
        var response = pingPongService.create(ping);
        return HttpResponse.ok(response);
    }
}