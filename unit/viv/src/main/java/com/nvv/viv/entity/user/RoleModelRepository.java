package com.nvv.viv.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleModelRepository extends JpaRepository<RoleModel, Long>, JpaSpecificationExecutor<RoleModel> {
}