package com.nvv.viv.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientProfileModelRepository extends JpaRepository<ClientProfileModel, Long>, JpaSpecificationExecutor<ClientProfileModel> {
}