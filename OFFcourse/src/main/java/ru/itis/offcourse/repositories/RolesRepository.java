package ru.itis.offcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.offcourse.models.Role;

public interface RolesRepository extends JpaRepository<Role, Long> {
}
