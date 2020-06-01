package y2020_mehta_sujay_period_4_individual_project;

import javafx.animation.AnimationTimer;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class World extends javafx.scene.layout.Pane{

    public Set<KeyCode> codes;

    private javafx.animation.AnimationTimer timer;

    public World() {

        timer = new AnimationTimer ( ) {
            @Override
            public void handle(long now) {
                for (int i = 0; i < getChildren().size(); i++) {
                    Node n = getChildren().get(i);
                    if (n instanceof Actor) {
                        Actor a = (Actor) n;
                        a.act ( now );
                    }
                }
            }
        };
        codes = new HashSet<>();

    }



    public abstract void act(long now);

    public void add(Actor a) {
        this.getChildren ().add(a);
    }

    public <A extends Actor> List<A> getObjects(java.lang.Class<A> cls) {
        List<A> list= new ArrayList<> ();
        for (int i = 0; i < this.getChildren().size(); i++) {
            if (this.getChildren().get(i).getClass().isInstance(cls)) {
                    list.add((A) this.getChildren().get(i));
                }

            }
        return list;

    }

    public void remove(Actor actor) {
        this.getChildren ().remove(actor);
    }

    public void start() {
        timer.start ();
    }

    public void stop() {
        timer.stop();
    }


    public void addCode(KeyCode code) {
        codes.add(code);
    }

    public void removeCode(KeyCode code) {
        codes.remove ( code );
    }

    public boolean isKeyDown(KeyCode code) {
        if (codes.contains ( code )) {
            return true;
        }
        return false;
    }



}
