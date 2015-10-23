package org.test.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.backend.entity.Users;
import org.test.backend.repository.UsersRepository;
import org.test.backend.services.UsersService;

import javax.transaction.Transactional;

/**
 * Created by achernysh on 23.10.2015.
 */
@Service
@Transactional
public class HibernateUsersService implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users save(Users user) {
        return usersRepository.save(user);
    }
}
