package com.saad.pays.service;


import java.util.List;

import com.saad.pays.entities.*;
public interface RoleService {
	 List <Role> findAll();
	    
	 Role saveRole(Role r);
	 Role updateRole(Role r);
	 Role getRole (Long idRole);
}
