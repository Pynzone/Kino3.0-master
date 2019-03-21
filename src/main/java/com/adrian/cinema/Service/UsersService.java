package com.adrian.cinema.Service;

import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Users;
import com.adrian.cinema.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;


    public List<Users> getAllUsers() {

        return usersRepository.findAll();
    }


    public Users createUsers(Users users) {

        return usersRepository.save(users);
    }

    public Users getUserById(Long usersId)
    {
        return usersRepository.findById(usersId).
                orElseThrow(()->new ResourceNotFoundException("Users","id_user",usersId));
    }

    public Users updateUsers(Long usersId, Users usersDetails)
    {
        Users users = usersRepository.findById(usersId).
                orElseThrow(()-> new ResourceNotFoundException("User","id_user",usersId));

        users.setEmail(usersDetails.getEmail());
        users.setName(usersDetails.getName());
        users.setSurname(usersDetails.getSurname());
        users.setPhone(usersDetails.getPhone());
        Users updatedUsers = usersRepository.save(users);
        return updatedUsers;
    }

    public ResponseEntity<?> deleteUsers(Long usersId)
    {
        Users users = usersRepository.findById(usersId).
                orElseThrow(()->new ResourceNotFoundException("User","id_users",usersId));
        usersRepository.delete(users);
        return ResponseEntity.ok().build();
    }
}
