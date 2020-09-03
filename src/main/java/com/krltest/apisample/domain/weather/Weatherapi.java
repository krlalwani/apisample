
package com.krltest.apisample.domain.weather;

import java.util.HashMap;
import java.util.Map;

public class Weatherapi {

    private Columns columns;
    private Location location;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Columns getColumns() {
        return columns;
    }

    public void setColumns(Columns columns) {
        this.columns = columns;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
