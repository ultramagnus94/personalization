package com.tcbs.personalization.operator.controller.back;

import config.SystemConfigService;
import config.dto.SystemConfigFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b/config")
@RequiredArgsConstructor
public class SystemConfigController {

    private final SystemConfigService configService;

    @GetMapping
    public ResponseEntity<?> get(SystemConfigFilter filter) {
        return ResponseEntity.ok(configService.getConfig(filter));
    }
}
