package projekt.zespolowy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.UserInfoRepository;
import projekt.zespolowy.dao.repository.UserRepository;
import projekt.zespolowy.domain.UserInfo;
import projekt.zespolowy.mappers.UserServiceMapper;
import projekt.zespolowy.web.dto.UserInfoDTO;

import java.util.Optional;

/**
 * Created by tomahavvq on 13.05.16.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;

    public Optional<UserInfoDTO> getUserInfoDTO(long userId) {
        UserInfo userInfo = userInfoRepository.getOne(userId);
        return Optional.of(UserServiceMapper.mapUserInfoEntityToDTO(userInfo));
    }
}
