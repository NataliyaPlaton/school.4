package ru.hogwarts.school4.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!test")
public class InfoServiceProduction implements InfoService {
    Logger logger = LoggerFactory.getLogger(InfoServiceTest.class);

    @Value("${server.port}")
    private int port;


    @Override
    public int getPort() {
        logger.info("Port = " + port);
        return port;
    }

}