package kovteba;

import java.util.List;

public class MusicPlayer {

   private List<Music> radioStations;

   public MusicPlayer(List<Music> radioStations) {
      this.radioStations = radioStations;
   }

   public void radioStationsSet(){
      radioStations.forEach(music -> System.out.println(music.getSong()));
   }


}
