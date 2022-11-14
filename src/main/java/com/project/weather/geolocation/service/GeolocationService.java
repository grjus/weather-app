package com.project.weather.geolocation.service;

import com.project.weather.geolocation.exceptions.GeolocationFetchingException;
import com.project.weather.geolocation.mapper.GeolocationMapper;
import com.project.weather.geolocation.model.GeolocationDto;
import com.project.weather.geolocation.model.GeolocationEntity;
import com.project.weather.geolocation.model.GeolocationResults;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class GeolocationService {

    final RestTemplate restTemplate;



    private GeolocationEntity getGeolocationEntityUsingName(String name) throws GeolocationFetchingException{
        String url = String.format("/search?name=%s&count=1",name);
        try {
            return Objects.requireNonNull(restTemplate.getForEntity(url, GeolocationResults.class).getBody()).results().get(0);
        }catch (Throwable t ){
            throw new GeolocationFetchingException("Error fetching geolocation",t.getCause());
        }
    }

    public GeolocationDto getGeolocationUsingName(String name) throws GeolocationFetchingException {
        return GeolocationMapper.toDto(getGeolocationEntityUsingName(name));
    }


}
