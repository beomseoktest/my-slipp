package net.slipp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.slipp.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

}
