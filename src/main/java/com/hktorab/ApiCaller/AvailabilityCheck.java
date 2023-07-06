package com.hktorab.ApiCaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@RestController
public class AvailabilityCheck {
    @ResponseBody
    @RequestMapping(value = "/testifalive/checkwheth&$!eritis&liveornot", method = RequestMethod.POST)
    public String getAvailabilityCheck() {
        return "ApiCaller : "+ getDateCurrentTime();
    }

    public String getDateCurrentTime() {
        ZoneOffset zoneOffSet = ZoneOffset.of("+06:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffSet);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return offsetDateTime.format(dateTimeFormatter);
    }
}
