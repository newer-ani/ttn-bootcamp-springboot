package com.ttn.Spring_Boot.Assingments.controllers;

import com.ttn.Spring_Boot.Assingments.dtos.versioning.UserV1;
import com.ttn.Spring_Boot.Assingments.dtos.versioning.UserV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserVersioningController {

    private final UserV1 userV1 = new UserV1("Animesh");
    private final UserV2 userV2 = new UserV2("Animesh", "animesh.yadav@tothenew.com", "123-456-7890");

    // A) MIME Type (Media Type) Versioning
    @GetMapping(value = "/mime", produces = "application/vnd.company.app-v1+json")
    public UserV1 getUserMimeV1() {
        return userV1;
    }

    @GetMapping(value="/mime",produces ="application/vnd.company.app-v2+json")
    public UserV2 getUserMimeV2()
    {
        return userV2;
    }

    // B) Request Parameter Versioning
    @GetMapping(value = "/param", params = "version=1")
    public UserV1 getUserParamV1() {
        return userV1;
    }

    @GetMapping(value = "/param", params = "version=2")
    public UserV2 getUserParamV2() {
        return userV2;
    }

    // C) URI Versioning
    @GetMapping("/v1")
    public UserV1 getUserUriV1() {
        return userV1;
    }

    @GetMapping("/v2")
    public UserV2 getUserUriV2() {
        return userV2;
    }

    @GetMapping(value="/header",headers = "X-VERSION-V1")
    public UserV1 getUserHeaderV1()
    {
        return userV1;
    }

    @GetMapping(value="/header",headers = "X-VERSION-V2")
    public UserV2 getUserHeaderV2()
    {
        return userV2;
    }
}
