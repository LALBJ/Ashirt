package org.csu.ashirt.domain;

import javax.persistence.*;

@Entity
@Table(name = "tutorial")
public class Tutorial {
    @Id
    private int tutorialId;

    @Column(name = "detail", nullable = false)
    private String detail;

    @Column(name = "video", nullable = false)
    private String video;

    public int getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(int tutorialId) {
        this.tutorialId = tutorialId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
