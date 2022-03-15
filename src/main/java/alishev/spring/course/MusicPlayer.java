package alishev.spring.course;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private MusicPlayer() {}

    public static MusicPlayer createNewMusicPlayer() {
        return new MusicPlayer();
    }

    private List<Music> musicList = new ArrayList<>();
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMusic(List<Music> music) {
        this.musicList = music;
    }

    public void doInit() {
        System.out.println("Doing my Initialization");
    }

    public void doDestroy() {
        System.out.println("Doing my Destroing");
    }

    public void playMusic() {
        System.out.println("Now playing: \n");
        this.musicList.forEach((s) -> System.out.println(s.getSong()));
        //System.out.println("Playing: " + music.getSong());
    }
}
