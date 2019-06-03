package kr.hs.dgsw.board_back.Service;

import kr.hs.dgsw.board_back.Domain.Post;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface PostService {

    List<Post> findAll();
    int deleteById(Long id);
    Long add(Post post);
    int modify(Post post);
    Post findById(Long id);
    List findByUserId(Long userId);
    Long addWithHashMap(Post post);
}
