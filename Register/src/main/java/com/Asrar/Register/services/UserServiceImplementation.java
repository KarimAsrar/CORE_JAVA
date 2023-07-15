package com.Asrar.Register.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Asrar.Register.Repo.UserRepo;
import com.Asrar.Register.entity.User;
import com.Asrar.Register.payload.UserDto;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	 private UserRepo userRepo;

	@Override
	public String addUser(UserDto userDto) {
			 
	        User user = new User(
	                userDto.getUserId(),
	                userDto.getUsername(),
	                userDto.getUseremail(),
	                userDto.getPassword()
	        );
	        userRepo.save(user);
	        return user.getUsername();
	    }
}
