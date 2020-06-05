package com.example.singinSevice.reposıtory;

import com.example.singinSevice.models.Accaunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccauntRepository extends JpaRepository<Accaunt,Long> {

    Accaunt findByLogin(String login);
}
