package com.db.sistemas.edificar.config;

import com.db.sistemas.edificar.domains.persons.entities.UserManager;
import com.db.sistemas.edificar.repository.persons.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UserRepository userRepository;

	public UserDetailsServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserManager userManager = userRepository.findByUsername(username)
						.orElseThrow(() -> new UsernameNotFoundException("User not Found with username: " + username));
    return new User(
						userManager.getUsername(),
				    userManager.getPassword(),
				    true,
				    true,
				    true,
				    true,
				    userManager.getAuthorities());
	}
}
