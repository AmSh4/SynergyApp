package com.synergy.repository;

import com.synergy.model.Integration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegrationRepository extends JpaRepository<Integration, Long> {
}