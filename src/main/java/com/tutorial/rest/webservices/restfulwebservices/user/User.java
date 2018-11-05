package com.tutorial.rest.webservices.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(description="All details about the user")
public class User {
    private Integer id;
    @Size(min = 2, message="Name should have at least 2 characters")
    @ApiModelProperty(notes="Name needs to have at least two characters")
    private String name;
    @Past
    @ApiModelProperty(notes="Birth date must be in the past")
    private Date birthdDate;

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
