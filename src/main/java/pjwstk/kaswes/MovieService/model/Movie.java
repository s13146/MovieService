package pjwstk.kaswes.MovieService.model;


import javax.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING) private MovieCategory category;

    public boolean isAvailable;



    public Movie() {
    }

    public Movie(Long id, String name, MovieCategory category,Boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }

    public void setAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


}
