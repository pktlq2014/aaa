package com.example.application;

public class StaffModel
{
    public String nameStaff;
    public Integer staffID;

    public StaffModel() {
    }

    public StaffModel(String nameStaff, Integer staffID) {
        this.nameStaff = nameStaff;
        this.staffID = staffID;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }
}
