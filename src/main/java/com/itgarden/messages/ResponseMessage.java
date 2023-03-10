package com.itgarden.messages;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
//@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class ResponseMessage<T> {

    private T responseClassType; // EmployeeDTO, customerDTO,VendorDTO , StockDTO or OrderDTO

    private String message;

    private String messageType;

    public static <T> ResponseMessage<T> withResponseData(T classType, String message,String messageType) {
        return new ResponseMessage<T>(classType, message, messageType);
    }

//    public static <T> ResponseMessage<T> withResponseData(T classType) {
//        return new ResponseMessage<T>(classType);
//    }

    public static ResponseMessage<Void> empty() {
        return new ResponseMessage<>();
    }


}
