package com.example.FinalProject.repository;

import com.example.FinalProject.repository.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete
public interface ItemRepository extends JpaRepository<Item, Integer>
{
}