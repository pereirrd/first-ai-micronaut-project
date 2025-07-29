package com.ai;

import io.micronaut.http.annotation.*;

@Controller("/first-ai-micronaut-project")
public class FirstAiMicronautProjectController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}