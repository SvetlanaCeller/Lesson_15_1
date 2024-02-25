package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    @GetMapping("/dayOfWeek")
    public String dayOfWeekInRussian(@RequestParam(value = "day", defaultValue = "nothing") Days day) {
            switch (day) {
                case MONDAY -> {
                    return "Сегодня понедельник";
                }
                case TUESDAY -> {
                    return "Сегодня вторник";
                }
                case WEDNESDAY -> {
                    return "Сегодня среда";
                }
                case THURSDAY -> {
                    return "Сегодня четверг";
                }
                case FRIDAY -> {
                    return "Сегодня пятница";
                }
                case SATURDAY -> {
                    return "Сегодня суббота";
                }
                case SUNDAY -> {
                    return "Сегодня воскресенье";
                }
                default ->{
                   return "Попробуй еще раз";
                }

                }
            }
        }



