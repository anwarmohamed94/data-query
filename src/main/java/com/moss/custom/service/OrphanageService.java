package com.moss.custom.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moss.custom.dto.OrphanageDto;
import com.moss.custom.dto.OrphansLookupDTO;
import com.moss.custom.exception.OrphanageNotFoundException;
import com.moss.custom.mapper.OrphanMapper;
import com.moss.custom.model.orphan.Orphan;
import com.moss.custom.model.orphanage.Orphanage;
import com.moss.custom.repository.OrphanageRepository;

@Service
public class OrphanageService {

	@Autowired
	private OrphanageRepository orphanageRepository;

	public OrphanageDto getOrphanage(Long orphanageId) throws OrphanageNotFoundException {

		Optional<Orphanage> orphanage = orphanageRepository.findById(orphanageId);

		if (!orphanage.isPresent())
			throw new OrphanageNotFoundException(Long.toString(orphanageId));
		
		//return OrphanageMapper.MAPPER.mapToOrphanageDTO(orphanage.get());
		return null;
	}
	
	public List<OrphansLookupDTO> getOrphanageOrphans(Long orphanageId) throws OrphanageNotFoundException {

		Optional<Orphanage> orphanage = orphanageRepository.findById(orphanageId);

		if (!orphanage.isPresent())
			throw new OrphanageNotFoundException(Long.toString(orphanageId));

		Set<Orphan> orphans = orphanage.get().getOrphans();
		
		return orphans.stream().map((orphan) -> OrphanMapper.MAPPER.mapToOrphansLookupDTO(orphan))
				.collect(Collectors.toList());
	}
}
