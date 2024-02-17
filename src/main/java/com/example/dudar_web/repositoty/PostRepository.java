package com.example.dudar_web.repositoty;

import com.example.dudar_web.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends JpaRepository<Post,Long> {
}
