
package com.krltest.apisample.domain.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Columns  {

    private Wdir wdir;
    private Temp temp;
    private Address address;
    private Maxt maxt;
    private Latitude latitude;
    private Wspd wspd;
    private ResolvedAddress resolvedAddress;
    private Cloudcover cloudcover;
    private Heatindex heatindex;
    private Pop pop;
    private Mint mint;
    private Datetime datetime;
    private Precip precip;
    private Sealevelpressure sealevelpressure;
    private Snowdepth snowdepth;
    private Snow snow;
    private Name name;
    private Humidity humidity;
    private Wgust wgust;
    private Conditions conditions;
    private Windchill windchill;
    private Longitude longitude;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Wdir getWdir() {
        return wdir;
    }

    public void setWdir(Wdir wdir) {
        this.wdir = wdir;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Maxt getMaxt() {
        return maxt;
    }

    public void setMaxt(Maxt maxt) {
        this.maxt = maxt;
    }

    public Latitude getLatitude() {
        return latitude;
    }

    public void setLatitude(Latitude latitude) {
        this.latitude = latitude;
    }

    public Wspd getWspd() {
        return wspd;
    }

    public void setWspd(Wspd wspd) {
        this.wspd = wspd;
    }

    public ResolvedAddress getResolvedAddress() {
        return resolvedAddress;
    }

    public void setResolvedAddress(ResolvedAddress resolvedAddress) {
        this.resolvedAddress = resolvedAddress;
    }

    public Cloudcover getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Cloudcover cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Heatindex getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(Heatindex heatindex) {
        this.heatindex = heatindex;
    }

    public Pop getPop() {
        return pop;
    }

    public void setPop(Pop pop) {
        this.pop = pop;
    }

    public Mint getMint() {
        return mint;
    }

    public void setMint(Mint mint) {
        this.mint = mint;
    }

    public Datetime getDatetime() {
        return datetime;
    }

    public void setDatetime(Datetime datetime) {
        this.datetime = datetime;
    }

    public Precip getPrecip() {
        return precip;
    }

    public void setPrecip(Precip precip) {
        this.precip = precip;
    }

    public Sealevelpressure getSealevelpressure() {
        return sealevelpressure;
    }

    public void setSealevelpressure(Sealevelpressure sealevelpressure) {
        this.sealevelpressure = sealevelpressure;
    }

    public Snowdepth getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(Snowdepth snowdepth) {
        this.snowdepth = snowdepth;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public Wgust getWgust() {
        return wgust;
    }

    public void setWgust(Wgust wgust) {
        this.wgust = wgust;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public Windchill getWindchill() {
        return windchill;
    }

    public void setWindchill(Windchill windchill) {
        this.windchill = windchill;
    }

    public Longitude getLongitude() {
        return longitude;
    }

    public void setLongitude(Longitude longitude) {
        this.longitude = longitude;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
