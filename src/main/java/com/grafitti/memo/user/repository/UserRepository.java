package com.grafitti.memo.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grafitti.memo.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	// WHERE `loginId` = ?? AND `password` == ??;
		public Optional<User> findByLoginIdAndPassword(String loginId, String password);

	}
