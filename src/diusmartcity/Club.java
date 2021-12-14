/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diusmartcity;

/**
 *
 * @author SRJOY
 */
public class Club {
    private int studentId;
    private String clubName;
    private int clubId;

    public Club(int studentId, int clubId) {
        this.studentId = studentId;
        this.clubId = clubId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }
    
}
