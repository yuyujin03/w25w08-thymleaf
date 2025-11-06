package kr.ac.kumoh.s20220667.w25w08_thymleaf.service

import kr.ac.kumoh.s20220667.w25w08_thymleaf.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService (private val repository: SongRepository){
    /**
     * 모든 노래 리스트 얻음
     */
    fun getAllSongs() = repository.findAll()

    /**
     * id와 일치하는 노래 얻음
     */
    fun getSSongById(id:Int) = repository.findByID(id)

    /**
     * 랜덤으로 노래 한 곡 얻음
     - **NOTE:** 리스트가 많을 때는 성능 저하 우려
     */
    fun getRandomSong() = repository.findAll().randomOrNull()
}