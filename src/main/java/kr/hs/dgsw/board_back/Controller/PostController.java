package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/api/board")
    public List board() {
        return this.postService.findAll();
    }

    @DeleteMapping("/delete/board/{id}")
    public int deleteById(@PathVariable Long id) {
        return this.postService.deleteById(id);
    }

    @PostMapping("/add/board")
    public Long add(@RequestBody Post post) {
        return this.postService.add(post);
    }

    @PutMapping("/modify/board")
    public int modify(@RequestBody Post post) {
        return this.postService.modify(post);
    }

    @GetMapping("/get/board/{id}")
    public Post findById(@PathVariable Long id) {
        return this.postService.findById(id);
    }

    @GetMapping("/getByUserId/board/{userId}")
    public List findByUserId(@PathVariable Long userId) {
        return this.postService.findByUserId(userId);
    }

    @PostMapping("/addHash/board")
    public Long addWithHashMap(@RequestBody Post post) {
        return this.postService.addWithHashMap(post);
    }

}
