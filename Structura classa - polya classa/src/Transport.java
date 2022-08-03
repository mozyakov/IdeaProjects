public class Transport {
    public float speed;
    public int weight;
    public String color;
    /*public void  toUpSpeed(float speed2) {
        float x = speed + speed2;
        return x;
    }

     */
    public float upSpeed(float speed2) {
        //public speed2 + speed;
        this.speed = speed + speed2;
        return speed;
    }
    public String getValue() {
        return "Object speed: " + speed + " weight: " + weight + " color: " + color;
    }
    public void setValues(float speed, int weight, String color) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
