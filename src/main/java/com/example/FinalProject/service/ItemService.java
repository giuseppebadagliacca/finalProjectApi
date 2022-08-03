package com.example.FinalProject.service;

import com.example.FinalProject.repository.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService
{
    Item save(Item item);

    void delete(int itemId);

    List<Item> all();

    Optional<Item> findById(int itemId);

}