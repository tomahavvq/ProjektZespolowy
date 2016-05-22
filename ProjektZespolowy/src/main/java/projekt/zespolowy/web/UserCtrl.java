package projekt.zespolowy.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import projekt.zespolowy.service.UserService;
import projekt.zespolowy.web.dto.UserInfoDTO;

import javax.inject.Inject;

@RestController
@RequestMapping("api/user")
public class UserCtrl {

    @Inject
    private UserService userService;

    @RequestMapping(value = "/info/{userId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserInfoDTO> getUserInfoDTO(@PathVariable Long userId) {
        return userService.getUserInfoDTO(userId)
                .map(userInfoDTO -> new ResponseEntity<>(userInfoDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
