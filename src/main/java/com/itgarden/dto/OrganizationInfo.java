package com.itgarden.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrganizationInfo extends BaseInfo {

    private String orgCode;

    private String orgName;

    private UserInfo user;
}
