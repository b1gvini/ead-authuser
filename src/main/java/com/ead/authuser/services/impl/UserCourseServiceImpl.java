package com.ead.authuser.services.impl;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.repositories.UserCourseRepository;
import com.ead.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserCourseServiceImpl implements UserCourseService {

    @Autowired
    UserCourseRepository userCourseRepository;

    @Override
    public List<UserCourseModel> findAll() {
        return userCourseRepository.findAll();
    }

    @Override
    public Optional<UserCourseModel> findById(UUID userId) {
        return userCourseRepository.findById(userId);
    }

    @Override
    public void delete(UserCourseModel userModel) {
        userCourseRepository.delete(userModel);
    }

    @Override
    public void save(UserCourseModel userModel) {
        userCourseRepository.save(userModel);
    }

    @Override
    public Page<UserCourseModel> findAll(Specification<UserCourseModel> spec, Pageable pageable) {
        return userCourseRepository.findAll(spec, pageable);
    }
}
