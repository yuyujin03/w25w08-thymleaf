package kr.ac.kumoh.s20220667.w25w08_thymleaf.service

import kr.ac.kumoh.s20220667.w25w08_thymleaf.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService (private val repository: SongRepository){
    fun getAllSongs() = repository.findAll()
    fun getSSongById(id:Int) = repository.findByID(id)
    fun getRandomSong() = repository.findAll().randomOrNull()
}