package com.tutorial.rest.webservices.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@ApiModel(description="All details about the user")
@Entity //Marks User as an Entity
public class User {

    @Id //Marks id as the primary key
    @GeneratedValue //Marks id as a generated value by the database
    private Integer id;
    @Size(min = 2, message="Name should have at least 2 characters")
    @ApiModelProperty(notes="Name needs to have at least two characters")
    private String name;
    @Past
    @ApiModelProperty(notes="Birth date must be in the past")
    private Date birthdDate;

    //Mapped by the user field in Post class
    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdDate() {
        return birthdDate;
    }

    public void setBirthdDate(Date birthdDate) {
        this.birthdDate = birthdDate;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdDate=" + birthdDate +
                '}';
    }

    protected User() {
    }

    public User(Integer id, String name, Date birthdDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthdDate = birthdDate;
    }
}
