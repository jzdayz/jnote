package com.ms1;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@Component
@RestControllerEndpoint(id = "custom")
public class EndpointTestController {


    @GetMapping
    public Object read(){
        return "CUSTOM READ ";
    }

}
