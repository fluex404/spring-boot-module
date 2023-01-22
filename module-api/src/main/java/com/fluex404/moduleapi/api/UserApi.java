package com.fluex404.moduleapi.api;

import com.fluex404.moduleservice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserApi {

    private final UserService userService;

    @GetMapping
    public ResponseEntity user(){
        return ResponseEntity.ok(userService.getUsers());
    }
}
