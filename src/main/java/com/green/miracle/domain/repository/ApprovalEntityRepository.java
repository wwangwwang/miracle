package com.green.miracle.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.green.miracle.domain.entity.PerformancePlanEntity;

public interface ApprovalEntityRepository extends JpaRepository<PerformancePlanEntity, Long>{

	List<PerformancePlanEntity> findByApproval(int approval);
}
