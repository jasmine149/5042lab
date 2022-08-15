package com.demo.model;
import javax.persistence.*;
@Entity
public class persistingRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomname;
    private String roomtype;
    private String roomfloor;
    public persistingRoom() {
    }
    public persistingRoom(String roomname, String roomtype, String roomfloor) {
        this.roomname = roomname;
        this.roomtype = roomtype;
        this.roomfloor = roomfloor;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRoomname() {
     return roomname;
    }
    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }
    public String getRoomtype() {
        return roomtype;
    }
    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }
    public String getRoomfloor() {
        return roomfloor;
    }
    public void setRoomfloor(String roomfloor) {
        this.roomfloor = roomfloor;
    }
}
