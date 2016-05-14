package projekt.zespolowy.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.zespolowy.service.RunService;
import projekt.zespolowy.web.dto.RunDTO;

import javax.inject.Inject;

/**
 * Created by tomahavvq on 14.05.16.
 */
@RestController
@RequestMapping("api/run")
public class RunCtrl {

    @Inject
    private RunService runService;

    @RequestMapping(value = "/run/{userId}",
            method = RequestMethod.POST)
    public ResponseEntity<?> savRun(@RequestBody RunDTO runDTO, @PathVariable Long userId) {
        return runService.saveRun(runDTO, userId)
                .map(run -> new ResponseEntity<>(run.getId(), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @RequestMapping(value = "/run/{runId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RunDTO> getRunDto(@PathVariable Long runId) {
        return runService.getRun(runId)
                .map(runDTO -> new ResponseEntity<>(runDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
