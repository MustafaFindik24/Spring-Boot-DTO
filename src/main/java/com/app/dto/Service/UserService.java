package com.app.dto.Service;

import com.app.dto.Model.User;
import com.app.dto.dto.UserDto;
import com.app.dto.dto.UserGetDto;
import com.app.dto.dto.UserUpdateDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

     UserGetDto getUser(Long id);
     List<UserDto> allUsers();
     UserDto saveUser(UserDto user);
     void deleteUser(Long id);
     void updateUser(UserUpdateDto userUpdateDto);
}
