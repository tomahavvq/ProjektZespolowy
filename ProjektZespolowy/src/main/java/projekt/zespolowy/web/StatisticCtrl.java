package projekt.zespolowy.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import projekt.zespolowy.service.StatisticService;
import projekt.zespolowy.web.dto.StatisticDTO;

import javax.inject.Inject;

/**
 * Created by pysiek on 12.06.16.
 */
@RestController
@RequestMapping("api/statistic")
public class StatisticCtrl {
    @Inject
    private StatisticService statisticService;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public ResponseEntity<StatisticDTO> getStatisticDTOByUserId(@PathVariable Long userId) {
        return new ResponseEntity<>(statisticService.getUserStatistics(userId), HttpStatus.OK);
    }
}
