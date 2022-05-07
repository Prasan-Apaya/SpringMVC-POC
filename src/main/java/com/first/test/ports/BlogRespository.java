package com.first.test.ports;

import com.first.test.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRespository extends JpaRepository<Blog,Integer> {
}
