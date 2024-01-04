package edu.icet.crm.controller;

import edu.icet.crm.model.Course;
import edu.icet.crm.service.impl.CourseService;
import edu.icet.crm.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/get-courses")
    List<Course>getCourses(){
        CourseServiceImpl service=new CourseServiceImpl();
        return service.getCourses();
    }
}
