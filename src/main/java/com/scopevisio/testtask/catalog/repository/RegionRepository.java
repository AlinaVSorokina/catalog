package com.scopevisio.testtask.catalog.repository;


import com.scopevisio.testtask.catalog.entity.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends CrudRepository<Region, String> {

    List<Region> findByPostcode(String postcode);
}
