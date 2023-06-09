package com.varava.cryptoCurrencyWatcher.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CryptoCurrencyDto {
    private Long id;
    private String symbol;
    private BigDecimal priceUSD;
}
