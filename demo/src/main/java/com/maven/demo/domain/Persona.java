package com.maven.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "persona")
public class Persona {
    
    @Id
    private String per_id;
    private String per_name;
    private String per_lname;
}