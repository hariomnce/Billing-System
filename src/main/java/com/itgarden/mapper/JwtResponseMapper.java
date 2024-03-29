package com.itgarden.mapper;

import com.itgarden.dto.AuthenticationResponseInfo;
import com.itgarden.entity.JwtToken;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface JwtResponseMapper {

	JwtResponseMapper INSTANCE = Mappers.getMapper(JwtResponseMapper.class);

	JwtToken authResponseToJwt(AuthenticationResponseInfo authenticationResponseDTO);

	@InheritInverseConfiguration
	AuthenticationResponseInfo jwtToAuthResponse(JwtToken jwtToken);
}
