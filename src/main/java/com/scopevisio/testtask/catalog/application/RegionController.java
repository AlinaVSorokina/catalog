package com.scopevisio.testtask.catalog.application;

import com.scopevisio.testtask.catalog.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @GetMapping("/region")
    public RegionResponse getRegionByPostcode(@RequestParam("postcode") String postcode) {
        return new RegionResponse(regionService.findBundeslandByPostcode(postcode), postcode);
    }

}
