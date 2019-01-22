package com.rk.courses.Controller;

import com.rk.courses.model.Course;
import com.rk.courses.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by j1007652 on 8/20/2018.
 */

@RestController
@RequestMapping(path = "/api")
public class CourseController {

    private static final Logger log = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    protected Environment env;

    @Autowired
    CourseService courseService;

    @RequestMapping(path = "/courses/{name}", method = RequestMethod.GET)
    public Course getCourse(@PathVariable String name)
    {
        log.debug("getCourse - begin");
        log.debug("Server Port : "+env.getProperty("server.port"));
        return courseService.getCourseDetails(name);
    }

    @RequestMapping("/courses")
    //@RequestMapping(path = "/courses")
    //@RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses()
    {
        log.debug("getAllCourses - begin");
        return courseService.getAllCourseDetails();
    }
}
