package kr.co.vibevillage.user.model.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    // 로그인
    public String login(String userId, String userPassword);
}
