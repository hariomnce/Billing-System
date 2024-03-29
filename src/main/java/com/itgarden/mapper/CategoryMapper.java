package com.itgarden.mapper;

import com.itgarden.dto.CategoryInfo;
import com.itgarden.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface CategoryMapper {

	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

	Category categoryInfoToCategory(CategoryInfo categoryInfo);

	@InheritInverseConfiguration
	CategoryInfo categoryToCategoryInfo(Category category);

}
