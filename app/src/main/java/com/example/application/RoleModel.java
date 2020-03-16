package com.example.application;

public class RoleModel
{
    public String nameRole;
    public Integer roleID;

    public RoleModel(String nameRole, Integer roleID) {
        this.nameRole = nameRole;
        this.roleID = roleID;
    }

    public RoleModel() {
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }
}
