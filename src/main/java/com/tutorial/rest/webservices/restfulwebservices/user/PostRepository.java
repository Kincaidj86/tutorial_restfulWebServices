package com.tutorial.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//Managers users with a primary key that's an integer
public interface PostRepository extends JpaRepository<Post, Integer> {
}
