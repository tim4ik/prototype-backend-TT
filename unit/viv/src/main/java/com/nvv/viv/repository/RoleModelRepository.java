package com.nvv.viv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

interface RoleModelRepository extends JpaRepository<RoleModel, Long>, JpaSpecificationExecutor<RoleModel> {

}