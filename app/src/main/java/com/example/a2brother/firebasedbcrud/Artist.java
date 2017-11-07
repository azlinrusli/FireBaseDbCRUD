package com.example.a2brother.firebasedbcrud;

/**
 * Created by 2BROTHER on 11/7/2017.
 */

public class Artist {
    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    String artistId;
    String artistName;

    public Artist(){}
}
