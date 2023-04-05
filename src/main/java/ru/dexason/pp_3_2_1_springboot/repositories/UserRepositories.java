package ru.dexason.pp_3_2_1_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dexason.pp_3_2_1_springboot.model.User;


@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {
}
