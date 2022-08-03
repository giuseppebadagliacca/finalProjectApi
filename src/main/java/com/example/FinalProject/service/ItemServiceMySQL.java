package com.example.FinalProject.service;

import com.example.FinalProject.repository.entity.Item;
import com.example.FinalProject.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceMySQL implements ItemService
{
    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save( Item item )
    {
        //TODO implement this method
        return itemRepository.save(item);
    }

    @Override
    public void delete(int itemId)
    {
        //TODO implement this method
        itemRepository.deleteById(itemId);
    }

    @Override
    public List<Item> all() {
        //TODO implement this method
        List<Item> result = new ArrayList<>();
        itemRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Optional<Item> findById(int itemId )
    {
        //TODO implement this method
        return itemRepository.findById(itemId);
    }
}