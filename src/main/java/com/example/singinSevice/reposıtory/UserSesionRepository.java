package com.example.singinSevice.reposıtory;

import com.example.singinSevice.models.UserSessiions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSesionRepository extends JpaRepository<UserSessiions,Long> {
}
