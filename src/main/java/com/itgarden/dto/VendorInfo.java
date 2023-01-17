package com.itgarden.dto;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class VendorInfo extends BaseInfo {

    private String fullName;

    private String vendorCode;

    private UserInfo user;
}
