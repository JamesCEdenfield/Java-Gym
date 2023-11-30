package com.example.testWebApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testWebApp.models.member.member;

public interface memberRepo extends JpaRepository<member, Long> {

}
