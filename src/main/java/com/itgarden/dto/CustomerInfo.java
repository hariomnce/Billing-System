package com.itgarden.dto;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CustomerInfo extends BaseInfo {

    private String fullName;

    private String customerCode;

    private UserInfo user;

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "fullName='" + fullName + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", user=" + user +
                '}';
    }
}
