package com.example.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.entity.CurrencyExchange;
import com.example.microservices.repository.CurrencyExchangeRepo;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@Autowired
	private CurrencyExchangeRepo repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExhangeValue(@PathVariable String from, @PathVariable String to) {
//		CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
		if (currencyExchange == null) {
			throw new RuntimeException("Uable to find data from " + from + " to " + to);
		}

		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;
	}

	@GetMapping("/allCurrencyData")
	public List<CurrencyExchange> retrieveAll() {
		return repository.findAll();
	}
}
