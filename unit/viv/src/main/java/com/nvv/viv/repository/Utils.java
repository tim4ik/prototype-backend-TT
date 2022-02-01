package com.nvv.viv.repository;

class Utils {
    static RoleModel mapFrom(Role role){
        RoleModel roleModel = new RoleModel();
        roleModel.id = role.id();
        roleModel.name = role.uniqueName();
        return roleModel;
    }
    static Role mapFrom(RoleModel roleModel){
        return new Role(roleModel.id, roleModel.name);
    }

}
