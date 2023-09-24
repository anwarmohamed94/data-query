package com.moss.custom.mapper;

import com.moss.custom.dto.OrphanDto;
import com.moss.custom.dto.OrphansLookupDTO;
import com.moss.custom.model.orphan.Orphan;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-24T16:22:56+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
public class OrphanMapperImpl implements OrphanMapper {

    @Override
    public OrphanDto mapToOrphanDTO(Orphan orphan) {
        if ( orphan == null ) {
            return null;
        }

        OrphanDto orphanDto = new OrphanDto();

        orphanDto.setId( orphan.getId() );
        orphanDto.setFullName( orphan.getFullName() );
        orphanDto.setRegistrationStatus( orphan.getRegistrationStatus() );
        orphanDto.setNationalID( orphan.getNationalID() );
        orphanDto.setGender( orphan.getGender() );
        orphanDto.setEducationType( orphan.getEducationType() );

        return orphanDto;
    }

    @Override
    public OrphansLookupDTO mapToOrphansLookupDTO(Orphan orphan) {
        if ( orphan == null ) {
            return null;
        }

        OrphansLookupDTO orphansLookupDTO = new OrphansLookupDTO();

        if ( orphan.getId() != null ) {
            orphansLookupDTO.setId( orphan.getId() );
        }

        return orphansLookupDTO;
    }
}
