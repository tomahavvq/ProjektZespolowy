package projekt.zespolowy.mappers;

import projekt.zespolowy.domain.UserInfo;
import projekt.zespolowy.utils.TimeUtils;
import projekt.zespolowy.web.dto.UserInfoDTO;

/**
 * Created by tomahavvq on 13.05.16.
 */
public class UserMapper {

    public static UserInfoDTO mapUserInfoEntityToDTO(UserInfo userInfo) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserId(userInfo.getUser().getId());
        userInfoDTO.setBestPace(userInfo.getBestPace());
        userInfoDTO.setLongestRun(userInfo.getLongestRun());
        userInfoDTO.setLongestTraining(TimeUtils.secondsToTime(userInfo.getLongestTraining()));
        userInfoDTO.setTrainingAmount(userInfo.getTrainingAmount());
        return userInfoDTO;
    }

}
