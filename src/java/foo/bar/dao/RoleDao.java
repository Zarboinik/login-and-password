package foo.bar.dao;

import foo.bar.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long>{
}
