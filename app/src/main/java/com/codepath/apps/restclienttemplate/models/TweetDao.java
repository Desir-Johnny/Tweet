package com.codepath.apps.restclienttemplate.models;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TweetDao {

    @Query(value = "SELECT Tweet.body As tweet_body, Tweet.createdAt As tweet_createdAt, Tweet.id As tweet_id, User.* " +
            "FROM Tweet INNER JOIN User ON Tweet.userId = User.id ORDER BY Tweet.createdAt DESC LIMIT 5")

    List<TweetWithUser> recentItems();

    void insertModel(Tweet[] toArray);
}
