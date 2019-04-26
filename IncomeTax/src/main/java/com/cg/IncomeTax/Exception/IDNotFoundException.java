package com.cg.IncomeTax.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IDNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IDNotFoundException(String msg) {
		super(msg);
	}
}
