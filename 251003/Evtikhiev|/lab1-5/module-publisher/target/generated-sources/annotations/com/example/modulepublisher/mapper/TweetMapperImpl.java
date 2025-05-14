package com.example.modulepublisher.mapper;

import com.example.modulepublisher.dto.TweetDTO;
import com.example.modulepublisher.entity.Tweet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-15T17:14:04+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class TweetMapperImpl implements TweetMapper {

    @Override
    public Tweet toTweet(TweetDTO tweetDTO) {
        if ( tweetDTO == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setId( tweetDTO.getId() );
        tweet.setUserId( tweetDTO.getUserId() );
        tweet.setTitle( tweetDTO.getTitle() );
        tweet.setContent( tweetDTO.getContent() );

        return tweet;
    }

    @Override
    public TweetDTO toTweetDTO(Tweet tweet) {
        if ( tweet == null ) {
            return null;
        }

        TweetDTO tweetDTO = new TweetDTO();

        tweetDTO.setId( tweet.getId() );
        tweetDTO.setUserId( tweet.getUserId() );
        tweetDTO.setTitle( tweet.getTitle() );
        tweetDTO.setContent( tweet.getContent() );

        return tweetDTO;
    }

    @Override
    public List<Tweet> toTweetList(List<TweetDTO> tweetDTOS) {
        if ( tweetDTOS == null ) {
            return null;
        }

        List<Tweet> list = new ArrayList<Tweet>( tweetDTOS.size() );
        for ( TweetDTO tweetDTO : tweetDTOS ) {
            list.add( toTweet( tweetDTO ) );
        }

        return list;
    }

    @Override
    public List<TweetDTO> toTweetDTOLost(List<Tweet> tweets) {
        if ( tweets == null ) {
            return null;
        }

        List<TweetDTO> list = new ArrayList<TweetDTO>( tweets.size() );
        for ( Tweet tweet : tweets ) {
            list.add( toTweetDTO( tweet ) );
        }

        return list;
    }
}
