package com.robot.clienttest.service;

import com.robot.clienttest.client.NbuClient;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CronService {

    private final NbuClient nbuClient;

    @Scheduled(fixedRate = 5000)
    public void printCurrency() {
        var result = nbuClient.getCurrencies("20230113");
        result.forEach(System.out::println);
    }
}
