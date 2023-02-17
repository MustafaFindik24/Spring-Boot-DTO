package com.app.dto.Controller;

import com.app.dto.Model.User;
import com.app.dto.Service.UserService;
import com.app.dto.dto.UserDto;
import com.app.dto.dto.UserGetDto;
import com.app.dto.dto.UserUpdateDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public UserGetDto getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public UserDto saveUser(@RequestBody UserDto user){
        return userService.saveUser(user);
    }
    @GetMapping
    public List<UserDto> allUsers() {
        return userService.allUsers();
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
    @PutMapping
    public void updateUser(@RequestBody UserUpdateDto userUpdateDto){
        userService.updateUser(userUpdateDto);
    }

}
