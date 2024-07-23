package com.example.projetstage.repository;

import com.example.projetstage.model.ServiceFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceFieldsRepository extends JpaRepository<ServiceFields, Long> {
}
