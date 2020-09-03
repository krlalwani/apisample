
package com.krltest.apisample.domain.weather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {

    private Object stationContributions;
    private List<Value> values = null;
    private String id;
    private String address;
    private String name;
    private Integer index;
    private Double latitude;
    private Double longitude;
    private Double distance;
    private Double time;
    private CurrentConditions currentConditions;
    private Object alerts;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getStationContributions() {
        return stationContributions;
    }

    public void setStationContributions(Object stationContributions) {
        this.stationContributions = stationContributions;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public Object getAlerts() {
        return alerts;
    }

    public void setAlerts(Object alerts) {
        this.alerts = alerts;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
