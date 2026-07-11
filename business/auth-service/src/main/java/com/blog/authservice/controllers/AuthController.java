/*
 * AuthController.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.blog.authservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AuthController.java
 *
 * @author Nguyen
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @GetMapping
    public String auth() {
        return "This is for auth";
    }
}
