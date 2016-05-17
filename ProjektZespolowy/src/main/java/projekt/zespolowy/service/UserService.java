package projekt.zespolowy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.UserInfoRepository;
import projekt.zespolowy.dao.repository.UserRepository;
import projekt.zespolowy.domain.User;
import projekt.zespolowy.domain.UserInfo;
import projekt.zespolowy.mappers.UserMapper;
import projekt.zespolowy.web.dto.UserInfoDTO;

import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by tomahavvq on 13.05.16.
 */
@Service
@Transactional
public class UserService {

    @Inject
    private UserRepository userRepository;

    @Inject
    private UserInfoRepository userInfoRepository;

    public Optional<UserInfoDTO> getUserInfoDTO(long userId) {
        UserInfo userInfo = userInfoRepository.getOne(userId);
        return Optional.of(UserMapper.mapUserInfoEntityToDTO(userInfo));
    }

    public Optional<User> getUser(long userId) {
        User user = userRepository.getOne(userId);
        return Optional.of(user);
    }
}
