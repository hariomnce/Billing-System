package com.itgarden.mapper;

import com.itgarden.dto.RoleInfo;
import com.itgarden.entity.Employee;
import com.itgarden.entity.Role;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface RoleMapper {

	RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

	Employee roleInfoToRole(RoleInfo roleInfo);

	@InheritInverseConfiguration
	RoleInfo roleToRoleInfo(Role role);

}
