package com.journeyplus.compliance.repository;

import com.journeyplus.compliance.entity.ComplianceAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplianceAuditRepository extends JpaRepository<ComplianceAudit, Long> {
    List<ComplianceAudit> findByExpenseLineId(Long expenseLineId);

    // Correct nested property path for Spring Data JPA
    List<ComplianceAudit> findByExpenseLine_Id(Long expenseLineId);
}
