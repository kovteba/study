package kovteba;

public class RadioStationsFactory {

    public Music getRadioStation(String value) {
        switch (value) {
            case ("rock"):
                return new RockMusic();
            default:
                return new ClassicalMusic();
        }
    }

}
