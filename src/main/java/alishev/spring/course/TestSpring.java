package alishev.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //MusicPlayer my1 = MusicPlayer.createNewMusicPlayer();

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayerSpring", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayerSpring", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println("\n" + musicPlayer.getDescription());
        context.close();
    }
}
