package com.nvv.viv.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class RoleRepository implements Repository<Role>{
    @Autowired
    RoleModelRepository roleModelRepository;


    @Override
    public void create(Role record) {
        RoleModel roleModel = Utils.mapFrom(record);
        roleModelRepository.save(roleModel);
    }

    @Override
    public List<Role> read() {
        List<RoleModel> roleModels = roleModelRepository.findAll();
        if(roleModels!=null){

        }
        return null;
    }

    @Override
    public Role read(long id) {
        return null;
    }

    @Override
    public void update(Role record) {

    }

    @Override
    public void delete(long id) {

    }
}
