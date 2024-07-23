package com.example.projetstage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "route_url")
public class RouteUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private Date dateSoumission;
    private String testType;
    private String serviceFields;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "test_report_id")
    private TestReport testReport;

    public RouteUrl(Long id,
                    String url,
                    Date dateSoumission,
                    String testType,
                    String serviceFields,
                    User user,
                    TestReport testReport)
    {
        this.id = id;
        this.url = url;
        this.dateSoumission = dateSoumission;
        this.testType = testType;
        this.serviceFields = serviceFields;
        this.user = user;
        this.testReport = testReport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDateSoumission() {
        return dateSoumission;
    }

    public void setDateSoumission(Date dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getServiceFields() {
        return serviceFields;
    }

    public void setServiceFields(String serviceFields) {
        this.serviceFields = serviceFields;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TestReport getTestReport() {
        return testReport;
    }

    public void setTestReport(TestReport testReport) {
        this.testReport = testReport;
    }
}
