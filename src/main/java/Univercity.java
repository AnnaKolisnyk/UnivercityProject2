import java.util.List;

public class Univercity {
    private List<Cource> cources;

    public Univercity(List<Cource> cources) {
        this.cources = cources;
    }

    public void showCource(){
        for(Cource c : cources){
            c.getCource();
        }
    }
}
