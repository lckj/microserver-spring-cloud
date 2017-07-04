package wang.congjun.microserver.entity;

/**
 * Created by wangcongjun on 2017/6/18.
 */

public class MovieInfo {
    private Integer id;
    private String movieName;
    private Integer time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", time=" + time +
                '}';
    }
}
