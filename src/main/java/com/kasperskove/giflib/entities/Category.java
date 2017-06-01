package com.kasperskove.giflib.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String colorCode;

    @OneToMany (mappedBy = "category")
    private List<Gif> gifs = new ArrayList<>();

    public Category() {
    }

    public Category(String name, String colorCode, List<Gif> gifs) {
        this.name = name;
        this.colorCode = colorCode;
        this.gifs = gifs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public List<Gif> getGifs() {
        return gifs;
    }

    public void setGifs(List<Gif> gifs) {
        this.gifs = gifs;
    }
}
