package com.example.microservices.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {

	@Id
	private long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private String environment;

	public CurrencyExchange() {
		super();
	}

	public CurrencyExchange(long id, String from, String to, BigDecimal conversion) {
		super();
		this.setId(id);
		this.setFrom(from);
		this.setTo(to);
		this.setConversion(conversion);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversion() {
		return conversionMultiple;
	}

	public void setConversion(BigDecimal conversion) {
		this.conversionMultiple = conversion;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
