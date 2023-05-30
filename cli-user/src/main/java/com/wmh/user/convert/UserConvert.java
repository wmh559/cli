package com.wmh.user.convert;

import com.wmh.user.entity.dto.UserDto;
import com.wmh.user.entity.req.UserReq;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author wmh
 */
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    /**
     * UserReq to UserDto.
     * @param userReq
     * @return
     */
    @Mapping(source = "name",target = "name")
    @Mapping(source = "age",target = "age")
    UserDto reqToDto(UserReq userReq);
}
