package com.example.projetstage.repository;

import com.example.projetstage.model.TestHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestHistoryRepository extends JpaRepository<TestHistory, Long> {
    List<TestHistory> findByTestReportId(Long testReportId);
}
