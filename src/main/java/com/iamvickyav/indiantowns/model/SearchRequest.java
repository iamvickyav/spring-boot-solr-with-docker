package com.iamvickyav.indiantowns.model;

import javax.validation.constraints.NotBlank;

public class SearchRequest {

    @NotBlank
    private String state;
    private String district;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
