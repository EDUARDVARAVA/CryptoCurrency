package com.varava.cryptoCurrencyWatcher.controller;

import com.varava.cryptoCurrencyWatcher.domain.dto.CryptoCurrencyDto;
import com.varava.cryptoCurrencyWatcher.requestMapping.Mapping;
import com.varava.cryptoCurrencyWatcher.service.CryptoCurrencyService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(Mapping.CRYPTOCURRENCY_CONTROLLER)
public class CryptoCurrencyController {

    private final CryptoCurrencyService cryptoCurrencyService;

    @GetMapping
    public ResponseEntity<List<CryptoCurrencyDto>> getAllCryptoCurrencies() {
        List<CryptoCurrencyDto> cryptoCurrencies = cryptoCurrencyService.getAll();
        return ResponseEntity.ok(cryptoCurrencies);
    }

    @GetMapping("/price")
    public ResponseEntity<BigDecimal> getCryptoCurrencyPrice(
            @NotNull @RequestParam("symbol") String symbol) {
        BigDecimal price = cryptoCurrencyService.getPrice(symbol);
        return ResponseEntity.ok(price);
    }
}
