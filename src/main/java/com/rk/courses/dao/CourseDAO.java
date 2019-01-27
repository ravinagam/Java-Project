package com.rk.courses.dao;

import com.rk.courses.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1007652 on 8/20/2018.
 */

@Component
public class CourseDAO {

    @Autowired
    Course course;
    int courseFeeAI = 22500;
    int courseFeeML = 20000;
    public List<Course> getAllCourseDetails()
    {
        List<Course> courseList = new ArrayList<Course>();

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("AI");
        course1.setFee(courseFeeAI);

        courseList.add(course1);

        Course course2 = new Course();
        course2.setId(2);
        course2.setName("ML");
        course2.setFee(courseFeeML);

        courseList.add(course2);

        return courseList;
    }

    public Course getCourseDetails(String name)
    {
        Course course = new Course();

        if(name.equalsIgnoreCase("AI"))
        {
            course.setId(1);
            course.setName("AI");
            course.setFee(courseFeeAI);
        }
        else if(name.equalsIgnoreCase("ML"))
        {
            course.setId(1);
            course.setName("ML");
            course.setFee(courseFeeML);
        }
        return course;
    }

}
