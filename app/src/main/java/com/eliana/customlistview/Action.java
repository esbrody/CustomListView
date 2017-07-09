package com.eliana.customlistview;

/**
 * Created by Eliana on 03/05/2017.
 */

public class Action {

    private String title;
    private  int icon;

    public Action(String title, int icon){
        this.title = title;
        this.icon = icon;
    }


    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  title + ", " + icon;
    }
}
