package com.ead.authuser.services;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserCourseService {
    List<UserCourseModel> findAll();

    Optional<UserCourseModel> findById(UUID userId);

    void delete(UserCourseModel userModel);

    void save(UserCourseModel userModel);
    Page<UserCourseModel> findAll(Specification<UserCourseModel> spec, Pageable pageable);
}
