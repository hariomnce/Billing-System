package com.itgarden.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponseInfo extends BaseInfo {

    private String accessToken;

    private String refreshToken;

    private LocalDateTime accessTokenExpiration;

    private LocalDateTime refreshTokenExpiration;

    @JsonIgnore
    private String userName;



}
