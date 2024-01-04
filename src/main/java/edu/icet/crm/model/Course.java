package edu.icet.crm.model;


import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class Course {
    private String description;
    private String code;
    private String duration;

}
