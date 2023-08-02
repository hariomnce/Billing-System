package com.itgarden.messages;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

	private String errorMessage;
	private LocalDateTime localDateTime;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "ErrorMessage [errorMessage=" + errorMessage + ", localDateTime=" + localDateTime + "]";
	}

}
