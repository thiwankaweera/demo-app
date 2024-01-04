package edu.icet.crm.service.impl;

import edu.icet.crm.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    public List<Course> getCourses(){
        ArrayList<Course> list=new ArrayList();
        list.add(new Course("ICET","ICM","8"));
        return list;
    }
}
