package com.varava.cryptoCurrencyWatcher.service;

import com.varava.cryptoCurrencyWatcher.domain.dto.UserCreateDto;
import com.varava.cryptoCurrencyWatcher.domain.dto.UserDto;

public interface UserService {

    UserDto notifyUser(UserCreateDto userDto);
}
