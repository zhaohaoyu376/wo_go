package com.gyf.szcrm.service.impl;

import com.gyf.szcrm.mapper.CourseOrderMapper;
import com.gyf.szcrm.mapper.UserMapper;
import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.MonthIncome;
import com.gyf.szcrm.model.PageResult;
import com.gyf.szcrm.model.User;
import com.gyf.szcrm.service.ICourseOrderService;
import com.gyf.szcrm.service.IUSerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUSerService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUserName(String username) {

        return userMapper.findByUserName(username);
    }
}
