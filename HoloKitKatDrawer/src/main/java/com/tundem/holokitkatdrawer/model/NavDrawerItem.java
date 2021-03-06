package com.tundem.holokitkatdrawer.model;


import com.joanzapata.android.iconify.Iconify.IconValue;

public class NavDrawerItem {

    private String title;
    private IconValue icon;
    private boolean primary = true;

    public NavDrawerItem() {
    }

    public NavDrawerItem(String title) {
        this.title = title;
    }

    public NavDrawerItem(String title, IconValue icon) {
        this.setTitle(title);
        this.setIcon(icon);
    }

    public NavDrawerItem(String title, boolean primary) {
        this.title = title;
        this.setPrimary(primary);
    }

    public NavDrawerItem(String title, IconValue icon, boolean primary) {
        this.setTitle(title);
        this.setIcon(icon);
        this.setPrimary(primary);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IconValue getIcon() {
        return icon;
    }

    public void setIcon(IconValue icon) {
        this.icon = icon;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}
