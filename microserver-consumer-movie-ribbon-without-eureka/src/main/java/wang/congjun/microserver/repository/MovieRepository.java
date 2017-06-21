package wang.congjun.microserver.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import wang.congjun.microserver.entity.MovieInfo;

/**
 * Created by wangcongjun on 2017/6/18.
 */
@Repository
@Mapper
public interface MovieRepository {
    @Insert("insert into movie (movie_name , time) values(#{movie.movieName},#{movie.time})")
    void saveMovie(@Param("movie") MovieInfo movie);
}
