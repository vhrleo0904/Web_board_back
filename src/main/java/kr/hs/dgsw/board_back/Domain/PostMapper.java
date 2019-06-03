package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Post post);
    int modify(Post post);
    Post findById(@Param("id") Long id);
    List findByUserId(Long userId);

    // userId   Long
    // title    String
    // content  String
    Long addWithHashMap(HashMap<String, Object> map);
}
