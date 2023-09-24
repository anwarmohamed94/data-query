package com.moss.custom.mapper;

import com.moss.custom.dto.GeneralLookupDTO;
import com.moss.custom.model.aid.AidType;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-24T16:22:56+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
public class GeneralLookupMapperImpl implements GeneralLookupMapper {

    @Override
    public AidType mapToAidType(GeneralLookupDTO aidTypeDto) {
        if ( aidTypeDto == null ) {
            return null;
        }

        AidType aidType = new AidType();

        aidType.setType( aidTypeDto.getType() );

        return aidType;
    }
}
