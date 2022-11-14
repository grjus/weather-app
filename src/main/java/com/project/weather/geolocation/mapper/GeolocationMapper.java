package com.project.weather.geolocation.mapper;

import com.project.weather.geolocation.model.GeolocationDto;
import com.project.weather.geolocation.model.GeolocationEntity;


public class GeolocationMapper {

    public static GeolocationDto toDto(GeolocationEntity geolocationEntity){
        return new GeolocationDto(geolocationEntity.getName(),
                geolocationEntity.getLatitude(),
                geolocationEntity.getLongitude(),
                geolocationEntity.getElevation(),
                geolocationEntity.getCountryCode(),
                geolocationEntity.getCountry(),
                geolocationEntity.getAdmin1(),
                geolocationEntity.getAdmin2(),
                geolocationEntity.getAdmin3());
    }

}
