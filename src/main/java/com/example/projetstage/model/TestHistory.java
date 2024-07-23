package com.example.projetstage.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "test_history")
public class TestHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateTest;

    @OneToOne
    @JoinColumn(name = "test_report_id")
    private TestReport testReport;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public TestHistory() {}

    public TestHistory(Long id,
                       Date dateTest,
                       TestReport testReport,
                       User user) {
        this.id = id;
        this.dateTest = dateTest;
        this.testReport = testReport;
        this.user = user;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateTest() {
        return dateTest;
    }

    public void setDateTest(Date dateTest) {
        this.dateTest = dateTest;
    }

    public TestReport getTestReport() {
        return testReport;
    }

    public void setTestReport(TestReport testReport) {
        this.testReport = testReport;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
