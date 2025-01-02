package com.dung.application.service;


import com.dung.application.entity.User;
import com.dung.application.model.dto.UserDTO;
import com.dung.application.model.request.ChangePasswordRequest;
import com.dung.application.model.request.CreateUserRequest;
import com.dung.application.model.request.UpdateProfileRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
