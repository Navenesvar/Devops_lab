package com.naven.simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naven.simple.domain.login;
@Repository
public interface Logrepo extends JpaRepository<login,String> {

public login findByUsernameAndPassword(String username, String password);
}
