package hello.it.loto.Lotteries;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class LotteriController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LotteriController.class);

    @GetMapping("/lotteries")
    String getAllLotteries() {
        System.out.println("works");
        return "index";
    }

    @GetMapping("/start-registration")
    String createLottery() {
        return "createLotteryForm";
    }

    @PostMapping("/lottery")
    String create(@Valid @ModelAttribute LotteryDto lotteryDto){
        System.out.println(lotteryDto);
        return "kk";

    }

}
