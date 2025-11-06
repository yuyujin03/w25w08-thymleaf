package kr.ac.kumoh.s20220667.w25w08_thymleaf.controller

import kr.ac.kumoh.s20220667.w25w08_thymleaf.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController (private val Service: SongService) {
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model) :String{
        model.addAttribute("song", Service.getRandomSong())
        return "random"
    }
}