
package com.krltest.apisample.domain.weather;

import java.util.HashMap;
import java.util.Map;

public class CurrentConditions {

    private Double wdir;
    private Double temp;
    private String sunrise;
    private Object visibility;
    private Double wspd;
    private String icon;
    private String stations;
    private Object heatindex;
    private Object cloudcover;
    private String datetime;
    private Double precip;
    private Double moonphase;
    private Object snowdepth;
    private Object sealevelpressure;
    private Double dew;
    private String sunset;
    private Double humidity;
    private Double wgust;
    private Object windchill;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getWdir() {
        return wdir;
    }

    public void setWdir(Double wdir) {
        this.wdir = wdir;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Object getVisibility() {
        return visibility;
    }

    public void setVisibility(Object visibility) {
        this.visibility = visibility;
    }

    public Double getWspd() {
        return wspd;
    }

    public void setWspd(Double wspd) {
        this.wspd = wspd;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStations() {
        return stations;
    }

    public void setStations(String stations) {
        this.stations = stations;
    }

    public Object getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(Object heatindex) {
        this.heatindex = heatindex;
    }

    public Object getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Object cloudcover) {
        this.cloudcover = cloudcover;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Double getMoonphase() {
        return moonphase;
    }

    public void setMoonphase(Double moonphase) {
        this.moonphase = moonphase;
    }

    public Object getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(Object snowdepth) {
        this.snowdepth = snowdepth;
    }

    public Object getSealevelpressure() {
        return sealevelpressure;
    }

    public void setSealevelpressure(Object sealevelpressure) {
        this.sealevelpressure = sealevelpressure;
    }

    public Double getDew() {
        return dew;
    }

    public void setDew(Double dew) {
        this.dew = dew;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getWgust() {
        return wgust;
    }

    public void setWgust(Double wgust) {
        this.wgust = wgust;
    }

    public Object getWindchill() {
        return windchill;
    }

    public void setWindchill(Object windchill) {
        this.windchill = windchill;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
