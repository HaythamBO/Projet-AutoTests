package com.example.projetstage.repository;

import com.example.projetstage.model.RouteUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteUrlRepository extends JpaRepository<RouteUrl, Long> {

    List<RouteUrl> findByUserId(Long userId);
    List<RouteUrl> findByTestReportId(Long testReportId);
}
