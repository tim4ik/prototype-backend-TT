package com.nvv.viv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HashTagModelRepository extends JpaRepository<HashTagModel, Long>, JpaSpecificationExecutor<HashTagModel> {
}