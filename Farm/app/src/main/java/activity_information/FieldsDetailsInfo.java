package activity_information;

/**
 * Created by yhf on 2017/6/1.
 */

public class FieldsDetailsInfo {
    private int id;
    private activity_information.blower[] blower;
    private activity_information.co2[] co2;
    private activity_information.lamp[] lamp;
    private activity_information.light[] light;
    private activity_information.nmembrane[] nmembrane;
    private activity_information.pump[] pump;
    private activity_information.salt[] salt;
    private activity_information.tmembrane[] tmembrane;
    private activity_information.water[] water;
    private activity_information.web[] web;
    private int Count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public activity_information.blower[] getBlower() {
        return blower;
    }

    public void setBlower(activity_information.blower[] blower) {
        this.blower = blower;
    }

    public activity_information.co2[] getCo2() {
        return co2;
    }

    public void setCo2(activity_information.co2[] co2) {
        this.co2 = co2;
    }

    public activity_information.lamp[] getLamp() {
        return lamp;
    }

    public void setLamp(activity_information.lamp[] lamp) {
        this.lamp = lamp;
    }

    public activity_information.light[] getLight() {
        return light;
    }

    public void setLight(activity_information.light[] light) {
        this.light = light;
    }

    public activity_information.nmembrane[] getNmembrane() {
        return nmembrane;
    }

    public void setNmembrane(activity_information.nmembrane[] nmembrane) {
        this.nmembrane = nmembrane;
    }

    public activity_information.pump[] getPump() {
        return pump;
    }

    public void setPump(activity_information.pump[] pump) {
        this.pump = pump;
    }

    public activity_information.salt[] getSalt() {
        return salt;
    }

    public void setSalt(activity_information.salt[] salt) {
        this.salt = salt;
    }

    public activity_information.tmembrane[] getTmembrane() {
        return tmembrane;
    }

    public void setTmembrane(activity_information.tmembrane[] tmembrane) {
        this.tmembrane = tmembrane;
    }

    public activity_information.water[] getWater() {
        return water;
    }

    public void setWater(activity_information.water[] water) {
        this.water = water;
    }

    public activity_information.web[] getWeb() {
        return web;
    }

    public void setWeb(activity_information.web[] web) {
        this.web = web;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = blower.length+co2.length+lamp.length
                +light.length+nmembrane.length+pump.length
                + salt.length+tmembrane.length
                + water.length+web.length;
    }
}