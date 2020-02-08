package hello.it.loto.Lotteries;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
public class LotteriController {

    @Resource
    private LotteryService lotteryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(LotteriController.class);

    @GetMapping("/lotteries")
    String getAllLotteries(Model model) {
        model.addAttribute("lotteries", lotteryService.getAllLotteries());
        return "index";
    }

    @GetMapping("/start-registration")
    String createLottery() {
        return "createLotteryForm";
    }

    @PostMapping("/lottery")
    String create(@Valid @ModelAttribute LotteryDto lotteryDto){
        lotteryService.createLottery(lotteryDto);
        System.out.println(lotteryDto);
        return "index";

    }

}
