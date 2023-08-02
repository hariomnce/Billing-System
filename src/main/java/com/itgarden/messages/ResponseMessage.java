package com.itgarden.messages;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
//@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class ResponseMessage<T> {

	private T responseClassType; // EmployeeDTO, customerDTO,VendorDTO , StockDTO or OrderDTO
	private String message;
	private String messageType;

	public T getResponseClassType() {
		return responseClassType;
	}

	public void setResponseClassType(T responseClassType) {
		this.responseClassType = responseClassType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	@Override
	public String toString() {
		return "ResponseMessage [responseClassType=" + responseClassType + ", message=" + message + ", messageType="
				+ messageType + "]";
	}

	public static <T> ResponseMessage<T> withResponseData(T classType, String message, String messageType) {
		return new ResponseMessage<T>(classType, message, messageType);
	}

//    public static <T> ResponseMessage<T> withResponseData(T classType) {
//        return new ResponseMessage<T>(classType);
//    }

	public static ResponseMessage<Void> empty() {
		return new ResponseMessage<>();
	}

}
