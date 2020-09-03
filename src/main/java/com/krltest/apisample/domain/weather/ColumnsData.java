package com.krltest.apisample.domain.weather;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ColumnsData {
    private Columns columns;

    public Columns getColumns() {
        return columns;
    }

    public void setColumns(Columns columns) {
        this.columns = columns;
    }
}
