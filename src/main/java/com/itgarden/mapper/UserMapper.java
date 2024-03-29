package com.itgarden.mapper;

import com.itgarden.dto.UserInfo;
import com.itgarden.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	User userInfoToUser(UserInfo userInfo);

	@InheritInverseConfiguration
	UserInfo userToUserInfo(User user);

}
