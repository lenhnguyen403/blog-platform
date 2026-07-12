/*
 * ProfileController.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.blog.userservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProfileController.java
 *
 * @author Nguyen
 */
@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    @GetMapping
    public ResponseEntity<?> getProfile() {
        return ResponseEntity.ok().build();
    }
}
