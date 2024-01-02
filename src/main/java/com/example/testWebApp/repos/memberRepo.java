package com.example.testWebApp.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testWebApp.models.member.member;

public interface memberRepo extends JpaRepository<member, Long> {
	member findByID(Long id);

	static Optional<member> findAll(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
