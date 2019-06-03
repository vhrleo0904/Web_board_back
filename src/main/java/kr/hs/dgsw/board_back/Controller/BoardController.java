package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Service.PostService;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    /*@GetMapping(value = "/api/users")
    public List users() {
        return this.userService.findAll();
    }

    @GetMapping(value = "/api/board")
    public List board() { return this.postService.findAll(); }*/

    /*@GetMapping
    public List list() {

        @Getter
        class TmpBoard {
            int id;
            String author;

            //@Getter (필요한 컬럼에만 사용하기도 함)
            String title;
            LocalDateTime created;
            TmpBoard(int id, String author, String title, LocalDateTime created) {
                this.id = id;
                this.author = author;
                this.title = title;
                this.created = created;
            }
        }
        List<TmpBoard> list = new ArrayList();
        list.add(new TmpBoard(1, "작성자1", "제목1", LocalDateTime.now()));
        return list;
    }*/
}
