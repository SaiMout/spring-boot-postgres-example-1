package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.MMnrc;

@Repository
public interface INrcRepository extends JpaRepository<MMnrc, Long> {
}