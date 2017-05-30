package com.servicemaster.entities;
// Generated May 7, 2017 7:35:27 PM by Hibernate Tools 4.3.1

/**
 * ServiceItem generated by hbm2java
 */
public class ServiceItem implements java.io.Serializable {

    private ServiceItemId id;
    private Item item;
    private Service service;

    public ServiceItem() {
    }

    public ServiceItem(ServiceItemId id, Item item, Service service) {
        this.id = id;
        this.item = item;
        this.service = service;
    }

    public ServiceItemId getId() {
        return this.id;
    }

    public void setId(ServiceItemId id) {
        this.id = id;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Service getService() {
        return this.service;
    }

    public void setService(Service service) {
        this.service = service;
    }

}
