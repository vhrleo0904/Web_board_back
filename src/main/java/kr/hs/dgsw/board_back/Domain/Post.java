package kr.hs.dgsw.board_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    Long id;
    Long userId;
    String title;
    String content;
    LocalDateTime created;
    LocalDateTime updated;
}
