package com.varava.cryptoCurrencyWatcher.controller;

import com.varava.cryptoCurrencyWatcher.domain.dto.UserCreateDto;
import com.varava.cryptoCurrencyWatcher.domain.dto.UserDto;
import com.varava.cryptoCurrencyWatcher.requestMapping.Mapping;
import com.varava.cryptoCurrencyWatcher.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(Mapping.USER_CONTROLLER)
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> notifyUser(@Valid @RequestBody UserCreateDto userDto) {
        UserDto createdUser = userService.notifyUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
