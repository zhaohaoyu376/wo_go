package com.gyf.szcrm.mapper;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.MonthIncome;
import com.gyf.szcrm.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public User findByUserName(String username);
}
