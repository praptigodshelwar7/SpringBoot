package com.praptigodshelwar.learningrestapis.dto;


import java.util.ArrayList;
import java.util.List;

public class GetAllNavigationItemsResponseDto {


    public Long id;
    public String name;
    public Long parent;
    public List<GetAllNavigationItemsResponseDto> children = new ArrayList<>();

    public GetAllNavigationItemsResponseDto(Long id, String name, Long parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }
}




