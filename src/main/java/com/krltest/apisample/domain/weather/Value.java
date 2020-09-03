
package com.krltest.apisample.domain.weather;

import java.util.HashMap;
import java.util.Map;

public class Value {

    private Double wdir;
    private Double temp;
    private Double maxt;
    private Double wspd;
    private String datetimeStr;
    private Double cloudcover;
    private Object heatindex;
    private Double pop;
    private Double mint;
    private Integer datetime;
    private Double precip;
    private Double sealevelpressure;
    private Double snowdepth;
    private Double snow;
    private Double humidity;
    private Double wgust;
    private String conditions;
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

    public Double getMaxt() {
        return maxt;
    }

    public void setMaxt(Double maxt) {
        this.maxt = maxt;
    }

    public Double getWspd() {
        return wspd;
    }

    public void setWspd(Double wspd) {
        this.wspd = wspd;
    }

    public String getDatetimeStr() {
        return datetimeStr;
    }

    public void setDatetimeStr(String datetimeStr) {
        this.datetimeStr = datetimeStr;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Object getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(Object heatindex) {
        this.heatindex = heatindex;
    }

    public Double getPop() {
        return pop;
    }

    public void setPop(Double pop) {
        this.pop = pop;
    }

    public Double getMint() {
        return mint;
    }

    public void setMint(Double mint) {
        this.mint = mint;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Double getSealevelpressure() {
        return sealevelpressure;
    }

    public void setSealevelpressure(Double sealevelpressure) {
        this.sealevelpressure = sealevelpressure;
    }

    public Double getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(Double snowdepth) {
        this.snowdepth = snowdepth;
    }

    public Double getSnow() {
        return snow;
    }

    public void setSnow(Double snow) {
        this.snow = snow;
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

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
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
