package com.innerman.emotracker.model.network;

/**
 * Created by petrpopov on 10.03.14.
 */
public class DeviceDTO {

    private String name;
    private String mac;

    public DeviceDTO() {
    }

    public DeviceDTO(String name, String mac) {
        this.name = name;
        this.mac = mac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
