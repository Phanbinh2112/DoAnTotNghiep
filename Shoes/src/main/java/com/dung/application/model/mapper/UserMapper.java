package com.dung.application.model.mapper;

import com.dung.application.entity.User;
import com.dung.application.model.dto.UserDTO;
import com.dung.application.model.request.CreateUserRequest;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;

public class UserMapper {
    public static UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFullName(user.getFullName());
        userDTO.setEmail(user.getEmail());
        userDTO.setAddress(user.getAddress());
        userDTO.setPhone(user.getPhone());
        userDTO.setAvatar(user.getAvatar());
        userDTO.setRoles(user.getRoles());

        return userDTO;
    }

    public static User toUser(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setFullName(createUserRequest.getFullName());
        user.setEmail(createUserRequest.getEmail());
        // Hash password using BCrypt
        String hash = BCrypt.hashpw(createUserRequest.getPassword(), BCrypt.gensalt(12));
        user.setPassword(hash);
        System.out.println(hash);
        user.setPhone(createUserRequest.getPhone());
        user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        user.setStatus(true);
        user.setRoles(new ArrayList<>(Arrays.asList("USER")));

        return user;
    }
}
