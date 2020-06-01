package y2020_mehta_sujay_period_4_individual_project;

import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class Actor extends javafx.scene.image.ImageView{

    public Actor() {

    }

    public abstract void act(long now);

    public double getHeight() {
        return this.getBoundsInParent ().getHeight ();
    }

    public double getWidth() {
        return this.getBoundsInParent ().getWidth ();
    }

    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls) {
        ArrayList<A> list = new ArrayList<A>();
        for (int i = 0; i < getWorld().getChildren().size(); i++) {
            Node node = getWorld().getChildren().get(i);
            if (cls.isInstance(node) && node.intersects(getBoundsInParent()) && !node.equals(this)) {
                list.add(cls.cast(node));
            }
        }
        return list;
    }

    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        List<A> list = getIntersectingObjects ( cls );
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public World getWorld() {
        return (World) this.getParent();
    }

    public void move(double dx, double dy) {
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }




}

