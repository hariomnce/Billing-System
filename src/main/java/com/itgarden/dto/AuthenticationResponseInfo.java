package com.itgarden.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponseInfo extends BaseInfo {

	private String accessToken;
	private String refreshToken;
	private LocalDateTime accessTokenExpiration;
	private LocalDateTime refreshTokenExpiration;

	@JsonIgnore
	private String userName;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public LocalDateTime getAccessTokenExpiration() {
		return accessTokenExpiration;
	}

	public void setAccessTokenExpiration(LocalDateTime accessTokenExpiration) {
		this.accessTokenExpiration = accessTokenExpiration;
	}

	public LocalDateTime getRefreshTokenExpiration() {
		return refreshTokenExpiration;
	}

	public void setRefreshTokenExpiration(LocalDateTime refreshTokenExpiration) {
		this.refreshTokenExpiration = refreshTokenExpiration;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "AuthenticationResponseInfo [accessToken=" + accessToken + ", refreshToken=" + refreshToken
				+ ", accessTokenExpiration=" + accessTokenExpiration + ", refreshTokenExpiration="
				+ refreshTokenExpiration + ", userName=" + userName + "]";
	}

}
