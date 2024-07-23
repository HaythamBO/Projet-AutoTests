package com.example.projetstage.repository;

import com.example.projetstage.model.TestReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TestReportRepository extends JpaRepository<TestReport, Long> {

}
