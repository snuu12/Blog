package com.company.Blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    // w Bazie dannych mamy kolumne name
    private String name;
    //w bazie dannych mamy kolumne contents
    private  String contents;


    @OneToMany(mappedBy = "blog")
    private List<Comment> comments=new ArrayList<>();


    @Override
    public String toString() {
        return name+"/"+contents;
    }
}
