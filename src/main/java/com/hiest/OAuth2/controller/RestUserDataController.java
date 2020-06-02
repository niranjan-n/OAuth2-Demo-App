package com.hiest.OAuth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hiest.OAuth2.domain.CustomUser;
import com.hiest.OAuth2.domain.UserProfile;


@RequestMapping("/api")
@RestController
public class RestUserDataController {

	@GetMapping("/customer/{userId}")
	public CustomUser getCustomerProfile(@PathVariable("userId") String userId) {
		CustomUser user = new CustomUser();
		user.setEmail("contact-us@javadevjournal.com");
		user.setFirstName("Demo");
		user.setLastName("User");
		user.setAge(21);
		user.setId(userId);
	    System.out.println("inside customer  profile");
		return user;
	}
	
	@GetMapping("/users/me")
	@ResponseBody
    public ResponseEntity<UserProfile> profile() 
    {

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = user.getUsername() + "@howtodoinjava.com";
 
        UserProfile profile = new UserProfile();
        profile.setName(user.getUsername());
        profile.setEmail(email);
        System.out.println("inside profile");
        return ResponseEntity.ok(profile);
    }
}
