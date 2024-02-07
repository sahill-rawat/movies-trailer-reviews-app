package io.sahill.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection="movies")

public class Movie {

    @Id
    private ObjectId objectId;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;

    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
    private List<Review> reviews;
}
