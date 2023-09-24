package com.moss.custom.mapper;

import com.moss.custom.dto.OrphanageDto;
import com.moss.custom.dto.OrphanagesLookupDTO;
import com.moss.custom.model.orphanage.Orphanage;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-24T16:22:56+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
public class OrphanageMapperImpl implements OrphanageMapper {

    @Override
    public OrphanageDto mapToOrphanageDto(Orphanage orphanage) {
        if ( orphanage == null ) {
            return null;
        }

        OrphanageDto orphanageDto = new OrphanageDto();

        if ( orphanage.getId() != null ) {
            orphanageDto.setId( String.valueOf( orphanage.getId() ) );
        }
        orphanageDto.setAddress( orphanage.getAddress() );

        return orphanageDto;
    }

    @Override
    public OrphanagesLookupDTO mapToOrphanagesLookupDTO(Orphanage orphan) {
        if ( orphan == null ) {
            return null;
        }

        OrphanagesLookupDTO orphanagesLookupDTO = new OrphanagesLookupDTO();

        if ( orphan.getId() != null ) {
            orphanagesLookupDTO.setId( orphan.getId() );
        }

        return orphanagesLookupDTO;
    }
}
