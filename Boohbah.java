public class Boohbah {
    private String name;
    private String danceMove;
    Boohbah(String name, String danceMove){
        this.name=name;
        this.danceMove=danceMove;
    }
    public String getName(){
        return name;
    }
    public String getDanceMove(){
        return danceMove;
    }
    public String preformMove(){
        return "Zing Zing Zingbah performs Spin and Sparkle";
    }
}
