package com.Asrar.Register.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.Asrar.Register.entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository < User ,Integer> {


}
