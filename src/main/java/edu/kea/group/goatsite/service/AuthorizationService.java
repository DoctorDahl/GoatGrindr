package edu.kea.group.goatsite.service;

import edu.kea.group.goatsite.model.Authorization;
import edu.kea.group.goatsite.repository.AuthorizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService {

    @Autowired
    AuthorizationRepository authorizationRepository;

    public void add(Authorization authorization) {
        authorizationRepository.save(authorization);
    }

    // change the role of a goat with ROLE_USER
    public void changeRole(Long id) {
        Authorization authorization = new Authorization();
        authorization.setGoatid(id);
        authorization.setRole("ROLE_ADMIN");
        authorizationRepository.save(authorization);
    }

}
