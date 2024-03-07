package org.example.repository;

import org.example.entity.Sandwich;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SandwichRepoImpl implements SandwichRepo {
    private static List<Sandwich> list;

    static {
        list = new ArrayList<>();
        list.add(new Sandwich("lettuce"));
        list.add(new Sandwich("tomato"));
        list.add(new Sandwich("mustard"));
        list.add(new Sandwich("sprouts"));
    }


    @Override
    public List<Sandwich> findAll() {
        return list;
    }


}
