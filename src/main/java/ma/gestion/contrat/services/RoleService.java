package ma.gestion.contrat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.gestion.contrat.models.Role;
import ma.gestion.contrat.repository.IRole;

@Service
public class RoleService {

    @Autowired
    private IRole roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
