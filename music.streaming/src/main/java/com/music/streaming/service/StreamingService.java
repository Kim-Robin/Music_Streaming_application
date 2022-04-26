package com.music.streaming.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class StreamingService{

    private static final String VIDEO_FORMAT = "classpath:videos/%s.mp4";

    private static final String MUSIC_FORMAT = "classpath:videos/%s.mp3";

    @Autowired
    private ResourceLoader resourceLoader;

    public Mono<Resource> getVideo(String title){
        return Mono.fromSupplier(() -> resourceLoader.
                getResource(String.format(VIDEO_FORMAT, title)));
    }
}
