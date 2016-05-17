package projekt.zespolowy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.RunRepository;
import projekt.zespolowy.domain.Run;
import projekt.zespolowy.domain.User;
import projekt.zespolowy.mappers.RunMapper;
import projekt.zespolowy.web.dto.RunDTO;

import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by tomahavvq on 14.05.16.
 */
@Service
@Transactional
public class RunService {

    @Inject
    private RunRepository runRepository;

    @Inject
    private UserService userService;

    @Inject
    private CoordinateService coordinateService;

    @Inject
    private PaceService paceService;

    public Optional<Run> saveRun(RunDTO runDTO, Long userId) {
        User user = userService.getUser(userId).get();

        Run run = new Run();
        run.setDateTime(runDTO.getDateTime());
        run.setDuration(runDTO.getDuration());
        run.setName(runDTO.getName());
        run.setUser(user);

        run = runRepository.save(run);
        run.setCoordinates(coordinateService.saveCoordinates(runDTO.getCoordinates(), run));
        run.setPaceList(paceService.savePace(runDTO.getPace(), run));

        return Optional.of(run);
    }

    public Optional<RunDTO> getRun(Long runId) {
        Run run = runRepository.getOne(runId);
        return Optional.of(RunMapper.mapRunEntityToDTO(run));

    }


}
