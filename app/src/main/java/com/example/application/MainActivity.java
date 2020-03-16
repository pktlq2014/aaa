package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private List<StaffModel> staffModels;
    private List<RoleModel> roleModels;
    private RecyclerView rcl_activity_main;
    private RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcl_activity_main = findViewById(R.id.rcl_activity_main);

        staffModels = new ArrayList<>();
        staffModels.add(new StaffModel("Nguyễn Văn A", 3));
        staffModels.add(new StaffModel("Nguyễn Văn B", 3));
        staffModels.add(new StaffModel("Nguyễn Văn C", 1));
        staffModels.add(new StaffModel("Nguyễn Văn D", 1));
        staffModels.add(new StaffModel("Nguyễn Văn E", 1));
        staffModels.add(new StaffModel("Nguyễn Văn F", 2));
        staffModels.add(new StaffModel("Nguyễn Văn G", 3));
        staffModels.add(new StaffModel("Nguyễn Văn H", 4));


        roleModels = new ArrayList<>();
        roleModels.add(new RoleModel("Quản Lý", 1));
        roleModels.add(new RoleModel("Thu Ngân", 2));
        roleModels.add(new RoleModel("Bán Hàng", 3));
        roleModels.add(new RoleModel("Tiếp Thị", 4));


        ArrayList<Group> groups = new ArrayList<>();
        Integer a, b = 0;
        for(RoleModel roleModel : roleModels)
        {
            Group group = new Group();
            group.staffModelList = new ArrayList<>();
            group.roleModelList = new ArrayList<>();
            group.idGroup = roleModel.roleID;
            a = roleModel.roleID;
            for(StaffModel staffModel : staffModels)
            {
                b = staffModel.staffID;
                if(group.idGroup == staffModel.staffID)
                {
                    group.staffModelList.add(staffModel);
                    group.roleModelList.add(roleModel);
                }
            }
            groups.add(group);
        }


        recyclerViewAdapter = new RecyclerViewAdapter(groups, this);
        rcl_activity_main.setAdapter(recyclerViewAdapter);
        rcl_activity_main.setLayoutManager(new LinearLayoutManager(this));
    }
}
