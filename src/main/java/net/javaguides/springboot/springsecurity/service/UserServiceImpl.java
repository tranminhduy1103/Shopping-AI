package net.javaguides.springboot.springsecurity.service;

import java.util.*;
import java.util.stream.Collectors;

import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.Entity.Role;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.repository.UserRepository;
import net.javaguides.springboot.springsecurity.web.dto.UserRegistrationDto;

/**This class is used to create some function for our website, also we can call JPA to help us query date from here by using @Auto-wired,**/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }



    public User save(UserRegistrationDto registration) {
        User user = new User();
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        user.setPassword(passwordEncoder.encode(registration.getPassword()));
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(),
                mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }

    public List<User> getAllUsers() {
       return userRepository.findAll();
    }

    public User getUserById(Long id) throws RecordNotFoundException
    {
        Optional<User> user = userRepository.findById(id);

        if(user.isPresent()) {
            return user.get();
        } else {
            throw new RecordNotFoundException("No user record exist for given id");
        }
    }

    public User create(User user) {

        User newEntity = user;
        newEntity.setEmail(user.getEmail());
        newEntity.setFirstName(user.getFirstName());
        newEntity.setLastName(user.getLastName());
        newEntity.setPhone(user.getPhone());
        newEntity.setGender(user.getGender());
        newEntity.setPassword(passwordEncoder.encode(user.getPassword()));
        newEntity.setDateOfBirth(user.getDateOfBirth());
        newEntity.setRoles(user.getRoles());
        newEntity = userRepository.save(newEntity);

        return newEntity;
    }




    public User update(User user) {
            Optional<User> newUser = userRepository.findById(user.getId());

            if(newUser.isPresent())
            {
                User newEntity = newUser.get();
                newEntity.setEmail(user.getEmail());
                newEntity.setFirstName(user.getFirstName());
                newEntity.setLastName(user.getLastName());
                newEntity.setPassword(passwordEncoder.encode(user.getPassword()));
                newEntity.setRoles(user.getRoles());
                newEntity = userRepository.save(newEntity);
                return newEntity;
            } else {
                user = userRepository.save(user);
                return user;
            }
        }

    public void deleteUserById(Long id) throws RecordNotFoundException
    {
        Optional<User> user = userRepository.findById(id);

        if(user.isPresent())
        {
            userRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No user record exist for given id");
        }
    }




}
