package com.adrian.cinema.controller;

import com.adrian.cinema.Service.UsersService;
import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UsersController {
        private final UsersService usersService;
        @Autowired
        UsersController(UsersService usersService){
            this.usersService=usersService;
        }

        @GetMapping("/users")
        public List<Users> getAllUsers() {

            return usersService.getAllUsers();
        }

        @PostMapping("/users")
        public Users createUssers(@Valid @RequestBody Users users) {

            return usersService.createUsers(users);
        }
    @GetMapping("/ussers/{id_usser}")
    public Users getUserById(@PathVariable(value = "id_user")Long usersId)
    {
        return usersService.getUserById(usersId);
    }
    @PutMapping("/users/{id_user}")
    public Users updateUsers(@PathVariable(value = "id_user")Long usersId, @Valid @RequestBody Users usersDetails)
    {
      return usersService.updateUsers(usersId,usersDetails);
    }
    @DeleteMapping("/users/{id_user}")
    public ResponseEntity<?> deleteUsers(@PathVariable(value = "id_user")Long usersId)
    {
        return usersService.deleteUsers(usersId);
    }
}