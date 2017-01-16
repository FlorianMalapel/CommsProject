package com.communicationproject.model;

import java.io.Serializable;

/**
 * Created by florianmalapel on 11/01/2017.
 */

public class Card implements Serializable {
    public String name, desc, url_video;
    public String image1_url, image2_url, image3_url;

    public Card(String name, String desc, String image1_url, String image2_url, String image3_url, String url_video) {
        this.name = name;
        this.desc = desc;
        this.image1_url = image1_url;
        this.image2_url = image2_url;
        this.image3_url = image3_url;
        this.url_video = url_video;
    }
}
