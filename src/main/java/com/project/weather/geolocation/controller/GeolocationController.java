package com.project.weather.geolocation.controller;

import com.project.weather.geolocation.exceptions.GeolocationFetchingException;
import com.project.weather.geolocation.model.GeolocationDto;
import com.project.weather.geolocation.service.GeolocationService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/geolocation")
@AllArgsConstructor
public class GeolocationController {

    GeolocationService geolocationService;

    @GetMapping(value = "/{name}",produces = "application/json")
    public GeolocationDto getGeolocation(@PathVariable String name) throws GeolocationFetchingException {
        return geolocationService.getGeolocationUsingName(name);
    }

}
