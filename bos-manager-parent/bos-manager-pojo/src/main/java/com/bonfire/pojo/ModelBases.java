package com.bonfire.pojo;

import java.util.Date;

public class ModelBases {
    private int id;
    private String countryIso;
    private String simOperator;
    private String operatorName;
    private String buildNumber;
    private String product;
    private String device;
    private String board;
    private String cpuAbi;
    private String cpuAbi2;
    private String manufacturer;
    private String brand;
    private String model;
    private String bootLoader;
    private String radio;
    private String hardware;
    private String versionIncremental;
    private String versionRelease;
    private String versionSdk;
    private String versionCodename;
    private String type;
    private String tags;
    private String fingerprint;
    private String time;
    private String user;
    private String host;
    private String vendorVersion;
    private Date createdAt;
    private Date updatedAt;

    public ModelBases(int id, String countryIso, String simOperator, String operatorName, String buildNumber, String product, String device, String board, String cpuAbi, String cpuAbi2, String manufacturer, String brand, String model, String bootLoader, String radio, String hardware, String versionIncremental, String versionRelease, String versionSdk, String versionCodename, String type, String tags, String fingerprint, String time, String user, String host, String vendorVersion, Date createdAt, Date updatedAt) {
        this.id = id;
        this.countryIso = countryIso;
        this.simOperator = simOperator;
        this.operatorName = operatorName;
        this.buildNumber = buildNumber;
        this.product = product;
        this.device = device;
        this.board = board;
        this.cpuAbi = cpuAbi;
        this.cpuAbi2 = cpuAbi2;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.model = model;
        this.bootLoader = bootLoader;
        this.radio = radio;
        this.hardware = hardware;
        this.versionIncremental = versionIncremental;
        this.versionRelease = versionRelease;
        this.versionSdk = versionSdk;
        this.versionCodename = versionCodename;
        this.type = type;
        this.tags = tags;
        this.fingerprint = fingerprint;
        this.time = time;
        this.user = user;
        this.host = host;
        this.vendorVersion = vendorVersion;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ModelBases(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getSimOperator() {
        return simOperator;
    }

    public void setSimOperator(String simOperator) {
        this.simOperator = simOperator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getCpuAbi() {
        return cpuAbi;
    }

    public void setCpuAbi(String cpuAbi) {
        this.cpuAbi = cpuAbi;
    }

    public String getCpuAbi2() {
        return cpuAbi2;
    }

    public void setCpuAbi2(String cpuAbi2) {
        this.cpuAbi2 = cpuAbi2;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBootLoader() {
        return bootLoader;
    }

    public void setBootLoader(String bootLoader) {
        this.bootLoader = bootLoader;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getVersionIncremental() {
        return versionIncremental;
    }

    public void setVersionIncremental(String versionIncremental) {
        this.versionIncremental = versionIncremental;
    }

    public String getVersionRelease() {
        return versionRelease;
    }

    public void setVersionRelease(String versionRelease) {
        this.versionRelease = versionRelease;
    }

    public String getVersionSdk() {
        return versionSdk;
    }

    public void setVersionSdk(String versionSdk) {
        this.versionSdk = versionSdk;
    }

    public String getVersionCodename() {
        return versionCodename;
    }

    public void setVersionCodename(String versionCodename) {
        this.versionCodename = versionCodename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getVendorVersion() {
        return vendorVersion;
    }

    public void setVendorVersion(String vendorVersion) {
        this.vendorVersion = vendorVersion;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ModelBases{" +
                "id=" + id +
                ", countryIso='" + countryIso + '\'' +
                ", simOperator='" + simOperator + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", buildNumber='" + buildNumber + '\'' +
                ", product='" + product + '\'' +
                ", device='" + device + '\'' +
                ", board='" + board + '\'' +
                ", cpuAbi='" + cpuAbi + '\'' +
                ", cpuAbi2='" + cpuAbi2 + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bootLoader='" + bootLoader + '\'' +
                ", radio='" + radio + '\'' +
                ", hardware='" + hardware + '\'' +
                ", versionIncremental='" + versionIncremental + '\'' +
                ", versionRelease='" + versionRelease + '\'' +
                ", versionSdk='" + versionSdk + '\'' +
                ", versionCodename='" + versionCodename + '\'' +
                ", type='" + type + '\'' +
                ", tags='" + tags + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", time='" + time + '\'' +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", vendorVersion='" + vendorVersion + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
