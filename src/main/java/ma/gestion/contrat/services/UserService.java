package ma.gestion.contrat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Role;
import ma.gestion.contrat.models.User;
import ma.gestion.contrat.repository.IRole;
import ma.gestion.contrat.repository.IUser;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {


    @Autowired
    private IUser userDao;

    @Autowired
    private IRole roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
   
    public User findById(String id) {
		return userDao.findById(id).get();
	}

	public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);
       /* User adminUser = new User();
        adminUser.setUsername("admin");
        adminUser.setPassword(getEncodedPassword("admin"));
        adminUser.setFirstname("admin");
        adminUser.setLastname("admin");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);*/
    }

    public User registerNewUser(User user) {
        Role role = roleDao.findById("Admin").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setPassword(getEncodedPassword(user.getPassword()));

        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
    
    
}
