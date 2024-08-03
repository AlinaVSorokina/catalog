package com.scopevisio.testtask.catalog.service;

import com.scopevisio.testtask.catalog.entity.Region;
import com.scopevisio.testtask.catalog.exception.NotFound;
import com.scopevisio.testtask.catalog.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionRepository regionRepository;

    public String findBundeslandByPostcode(final String postcode) {
        return findRegionByPostcode(postcode).stream().findAny()
                .map(Region::getREGION1)
                .orElseThrow(NotFound::new);
    }

    public List<Region> findRegionByPostcode(final String postcode) {
        return regionRepository.findByPostcode(postcode);
    }
}
