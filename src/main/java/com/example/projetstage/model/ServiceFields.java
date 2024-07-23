package com.example.projetstage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "service_fields")
public class ServiceFields {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fieldName;

    @ManyToOne
    @JoinColumn(name = "route_url_id")
    private RouteUrl routeUrl;


    public ServiceFields() {}

    public ServiceFields(Long id, String fieldName, RouteUrl routeUrl) {
        this.id = id;
        this.fieldName = fieldName;
        this.routeUrl = routeUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public RouteUrl getRouteUrl() {
        return routeUrl;
    }

    public void setRouteUrl(RouteUrl routeUrl) {
        this.routeUrl = routeUrl;
    }
}
