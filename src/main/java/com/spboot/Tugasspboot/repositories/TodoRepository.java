/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.Tugasspboot.repositories;

import com.spboot.Tugasspboot.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gayatri Apsarini
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}