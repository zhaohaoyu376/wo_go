package com.gyf.szcrm.service;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.MonthIncome;
import com.gyf.szcrm.model.PageResult;
import com.gyf.szcrm.model.User;

import java.util.List;

public interface IUSerService {

    public User findByUserName(String username);
}
