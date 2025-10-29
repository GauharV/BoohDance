public class DanceRoutine {
    private Boohbah[] boohbahs;
    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs=boohbahs;
    }
    public String buildRoutine(){
        StringBuilder routine= new StringBuilder();
        for (Boohbah boohbah: boohbahs){
            routine.append(boohbah.preformMove());
            routine.append("\n");
        }
        return routine.toString();
    }
    public String modifyroutine(){
        StringBuilder replace =new StringBuilder();
        for (Boohbah boohbah: boohbahs){
            String boohreplace= boohbah.preformMove().replace("preforms","dances to");
            replace.append(boohreplace).append("\n");
        }
        return replace.toString();
    }
}
