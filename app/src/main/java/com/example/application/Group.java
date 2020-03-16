package com.example.application;

import java.util.List;

public class Group
{
    public Integer idGroup;
    public List<StaffModel> staffModelList;
    public List<RoleModel> roleModelList;

    public Group() {
    }

    public Group(Integer idGroup, List<StaffModel> staffModelList) {
        this.idGroup = idGroup;
        this.staffModelList = staffModelList;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public List<StaffModel> getStaffModelList() {
        return staffModelList;
    }

    public void setStaffModelList(List<StaffModel> staffModelList) {
        this.staffModelList = staffModelList;
    }
}
