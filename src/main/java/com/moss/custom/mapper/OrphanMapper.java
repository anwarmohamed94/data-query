package com.moss.custom.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.moss.custom.dto.OrphanDto;
import com.moss.custom.dto.OrphansLookupDTO;
import com.moss.custom.model.orphan.Orphan;

@Mapper
public interface OrphanMapper {

	OrphanMapper MAPPER = Mappers.getMapper(OrphanMapper.class);
	
	OrphanDto mapToOrphanDTO(Orphan orphan);
	
	OrphansLookupDTO mapToOrphansLookupDTO(Orphan orphan);
}