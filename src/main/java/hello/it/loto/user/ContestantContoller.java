package hello.it.loto.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
public class ContestantContoller {
    @Resource
    private ContestantService contestantService;

    @GetMapping(value = "/register")
    public String registerPage(){
        return "registerContestantForm";
    }

    @PostMapping(value = "/register")
    public ResponseEntity register(@Valid @ModelAttribute ContestantDto contestantDto){
        contestantService.registerContestant(contestantDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
