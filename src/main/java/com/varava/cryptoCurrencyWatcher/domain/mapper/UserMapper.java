package com.varava.cryptoCurrencyWatcher.domain.mapper;

import com.varava.cryptoCurrencyWatcher.domain.dto.UserCreateDto;
import com.varava.cryptoCurrencyWatcher.domain.dto.UserDto;
import com.varava.cryptoCurrencyWatcher.domain.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User fromDto(UserCreateDto userDto);

    UserDto fromDto(User user);
}
