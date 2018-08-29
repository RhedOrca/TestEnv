public class Room {
    public static class main Room {
        Room room1 = new Room(false, null, null);
    }

    private boolean cleared = false;
    private String occupant = null;
    private String treasure = null;

    private boolean getCleared() {
        return cleared;
    }

    private void setCleared() {
        this.cleared = cleared;
    }

    private String getOccupant() {
        return occupant;
    }

    private void setOccupant() {
        this.occupant = occupant;
    }

    private String getTreasure() {
        return treasure;
    }

    private void setTreasure() {
        this.treasure = treasure;
    }

    public Room(boolean cleared, String occupant, String treasure) {
        this.cleared = cleared;
        this.occupant = occupant;
        this.treasure = treasure;
        system.out.println("you don't suck");
    }
}


