package com.robot.clienttest.client;

import com.robot.clienttest.domain.Currency;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "nbu-api", url = "https://bank.gov.ua/NBUStatService/v1/")
public interface NbuClient {

    @GetMapping("statdirectory/exchange?valcode=EUR&json")
    List<Currency> getCurrencies(@RequestParam("date") String date);


}
