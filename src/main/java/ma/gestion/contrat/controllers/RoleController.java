package ma.gestion.contrat.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.Role;
import ma.gestion.contrat.services.RoleService;


@RestController
@RequestMapping("api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/createRole")
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
}
