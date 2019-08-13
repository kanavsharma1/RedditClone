package redditClone.Reddit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import redditClone.Reddit.Repository.LinkRepositoy;
import redditClone.Reddit.domain.Link;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {
    private LinkRepositoy linkRepository;

    public LinkController(LinkRepositoy linkRepository) {
        this.linkRepository = linkRepository;
    }
    // list
    @RequestMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    // CRUD
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }
    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepository.findById(id);
    }
    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link) {
        return linkRepository.save(link);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    linkRepository.deleteById(id);
    }
}
