package domain;

import java.util.Arrays;

public class Room {

    private Integer roomId;
    private String rname;
    private String[] ids;
    private Computer[] computers;


    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", rname='" + rname + '\'' +
                ", ids=" + Arrays.toString(ids) +
                ", computers=" + Arrays.toString(computers) +
                '}';
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public Room(Integer roomId, String rname, String[] ids, Computer[] computers) {
        this.roomId = roomId;
        this.rname = rname;
        this.ids = ids;
        this.computers = computers;
    }

    public Room() {
    }
}
