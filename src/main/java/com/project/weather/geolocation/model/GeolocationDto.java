package com.project.weather.geolocation.model;

public record GeolocationDto(
        String name,
        Double latitude,
        Double longitude,
        Double elevation,
        String countryCode,
        String country,
        String admin1,
        String admin2,
        String admin3
){
}
