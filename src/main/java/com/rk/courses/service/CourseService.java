package com.rk.courses.service;

import com.rk.courses.dao.CourseDAO;
import com.rk.courses.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by j1007652 on 8/20/2018.
 */

@Component
public class CourseService {

    @Autowired
    CourseDAO courseDAO;

    public List<Course> getAllCourseDetails()
    {
        return courseDAO.getAllCourseDetails();
    }

    public Course getCourseDetails(String name)
    {
        return courseDAO.getCourseDetails(names);
    }

}
