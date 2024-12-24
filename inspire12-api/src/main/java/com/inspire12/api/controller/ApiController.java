package com.inspire12.api.controller;

import com.inspire12.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final CommonService commonService;

    public ApiController(CommonService commonService) {
        this.commonService = commonService;
    }

    @GetMapping
    public String api() {
        String command = commonService.getCommand();
        return command;
    }
}
