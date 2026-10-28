package Assignments.Factory.Assignment1;

public class AudioPlayerFactory {

    public Audioplayer createfactory (MediaFormat mediaFormat, int volume, double playbackrate){

      return   switch (mediaFormat){
          case MP3 -> new Mp3player(volume,playbackrate);
          case WAV -> new WavPlayer(volume,playbackrate);
          case FLAC -> new Flacplayer(volume,playbackrate);
      };

    }
}
