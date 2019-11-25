package edu.kea.group.goatsite.service;

import edu.kea.group.goatsite.model.Authorization;
import edu.kea.group.goatsite.model.Role;
import edu.kea.group.goatsite.repository.AuthorizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService {

    @Autowired
    AuthorizationRepository authorizationRepository;



    public void add(Authorization authorization) {
        authorizationRepository.save(authorization);
    }

    // change the role of a goat with ROLE_USER to also have the ROLE_ADMIN
//    public void changeRole(Long id, Role role) {
//        Authorization authorization = new Authorization();
//        authorization.setGoatId(id);
//        authorization.setRole(role);
//        if (authorization.getGoatId().equals(id)) {
//            if (authorization.getRole().equals(Role.ROLE_USER)) {
//                authorization.setRole(Role.ROLE_ADMIN);
//            } else if (authorization.getRole().equals(Role.ROLE_ADMIN)) {
//                authorization.setRole(Role.ROLE_USER);
//            } else if (authorization.getRole().equals(Role.ROLE_ADMIN) &&
//                    (authorization.getRole().equals(Role.ROLE_USER))) {
//                System.out.println("Both roles are taken");
//            }
//            authorizationRepository.save(authorization);
//        }



}
