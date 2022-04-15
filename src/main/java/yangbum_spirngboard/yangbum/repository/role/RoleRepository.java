package yangbum_spirngboard.yangbum.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import yangbum_spirngboard.yangbum.entity.member.RoleType;

import javax.management.relation.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleType(RoleType roleType);
}