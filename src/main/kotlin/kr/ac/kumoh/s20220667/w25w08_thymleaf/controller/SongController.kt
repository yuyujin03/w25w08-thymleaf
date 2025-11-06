package kr.ac.kumoh.s20220667.w25w08_thymleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model) :String{
        model.addAttribute("songTitle", "Soda Pop")
        return "random"
    }
}