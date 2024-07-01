package zerobase.weather.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchedulerService {
    private final DiaryService diaryService;

    @Scheduled(cron = "0 0 1 * * *")
    public void saveWeatherDate() {
        diaryService.saveWeatherDate();
    }
}