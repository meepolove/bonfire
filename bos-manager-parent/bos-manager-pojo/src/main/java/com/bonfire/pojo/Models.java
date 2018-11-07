package com.bonfire.pojo;

import java.util.Date;

public class Models {
    private int id;
    private String modelbaseId;
    private String imei;
    private String lineNumber;
    private String serialNumber;
    private String ismi;
    private String phoneId;
    private String serial;
    private String createdAt;
    private String updatedAt;

    public Models(){

    }

    public Models(int id, String modelbaseId, String imei, String lineNumber, String serialNumber, String ismi, String phoneId, String serial, String createdAt, String updatedAt) {
        this.id = id;
        this.modelbaseId = modelbaseId;
        this.imei = imei;
        this.lineNumber = lineNumber;
        this.serialNumber = serialNumber;
        this.ismi = ismi;
        this.phoneId = phoneId;
        this.serial = serial;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelbaseId() {
        return modelbaseId;
    }

    public void setModelbaseId(String modelbaseId) {
        this.modelbaseId = modelbaseId;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getCreatedAt() {
        return createdAt.substring(0,createdAt.length()-2);
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt.substring(0,updatedAt.length()-2);
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Models{" +
                "id=" + id +
                ", modelbaseId='" + modelbaseId + '\'' +
                ", imei='" + imei + '\'' +
                ", lineNumber='" + lineNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", ismi='" + ismi + '\'' +
                ", phoneId='" + phoneId + '\'' +
                ", serial='" + serial + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
