package com.varava.cryptoCurrencyWatcher.domain.mapper;

import com.varava.cryptoCurrencyWatcher.domain.dto.CryptoCurrencyDto;
import com.varava.cryptoCurrencyWatcher.domain.model.CryptoCurrency;
import com.varava.cryptoCurrencyWatcher.integration.CoinDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CryptoCurrencyMapper {

    CryptoCurrencyDto toDto(CryptoCurrency cryptoCurrency);

    List<CryptoCurrencyDto> toDto(List<CryptoCurrency> coins);

    List<CryptoCurrency> fromCoinDto(List<CoinDto> coinDtos);

    CryptoCurrency fromDto(CryptoCurrencyDto currencyDto);
}
