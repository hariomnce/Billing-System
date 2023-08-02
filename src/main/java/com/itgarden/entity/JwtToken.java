package com.itgarden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "JWT_TOKEN")
public class JwtToken extends BaseObject {

	@Column(name = "access_token", nullable = false)
	private String accessToken;

	@Column(name = "refresh_token", nullable = false)
	private String refreshToken;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "access_token_expiration", nullable = false)
	private LocalDateTime accessTokenExpiration;

	@Column(name = "refresh_token_expiration", nullable = false)
	private LocalDateTime refreshTokenExpiration;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public String toString() {
		return "JwtToken [accessToken=" + accessToken + ", refreshToken=" + refreshToken + ", userName=" + userName
				+ ", accessTokenExpiration=" + accessTokenExpiration + ", refreshTokenExpiration="
				+ refreshTokenExpiration + "]";
	}

}
