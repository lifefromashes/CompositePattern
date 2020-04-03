import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @org.junit.jupiter.api.Test
    void play() {
        Playlist playlist1 = new Playlist("Synth Pop");
        assertEquals("Synth Pop", playlist1.getName());

        Song synthSong = new Song("Girl Like You", "Toro Y Moi");
        assertEquals("Girl Like You", synthSong.getName());
        assertEquals("Toro Y Moi", synthSong.getArtist());
    }

    @Test
    public void addToPlaylist() {
        Playlist newPlaylist = new Playlist("Test Playlist");
        Song newSong = new Song("Hello", "Adele");

        newPlaylist.add(newSong);

        assertEquals("Test Playlist", newPlaylist.getName());
        assertEquals("Hello", newSong.getName());
        assertEquals("Adele", newSong.getArtist());
    }

    @Test
    public void shouldSetPlaybackSpeed() {
        Playlist newPlaylist = new Playlist("Test2 Playlist");
        float slowSpeed = 0.5f;

        newPlaylist.setPlaybackSpeed(slowSpeed);

        assertEquals(slowSpeed, newPlaylist);

    }
}

