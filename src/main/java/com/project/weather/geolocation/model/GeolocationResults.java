package com.project.weather.geolocation.model;

import java.util.List;

public record GeolocationResults(
        List<GeolocationEntity> results
) {
}
