package wang.congjun.microserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wang.congjun.microserver.entity.MovieInfo;
import wang.congjun.microserver.repository.MovieRepository;

/**
 * Created by wangcongjun on 2017/6/18.
 */
@RestController
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/movie/save")
    public MovieInfo saveMovie(@RequestParam("data") String data){
        String[] datas = data.split(",");
        MovieInfo movieInfo = new MovieInfo();
        movieInfo.setMovieName(datas[0]);
        movieInfo.setTime(Integer.parseInt(datas[1]));
        movieRepository.saveMovie(movieInfo);
        return movieInfo;
    }
}
