package edu.wctc;

import java.util.HashSet;
import java.util.Set;

public class VennDiagram<T> implements Addable<T> {
    private final String label1;
    private final String label2;
    private final String label3;

    private final Set<T> circle1;
    private final Set<T> circle2;
    private final Set<T> circle3;

    public VennDiagram(String label1, String label2, String label3) {
        this.label1 = label1;
        this.label2 = label2;
        this.label3 = label3;
        this.circle1 = new HashSet<>();
        this.circle2 = new HashSet<>();
        this.circle3 = new HashSet<>();
    }

    private Set<T> getCircleForLabel(String label) {
        // Adding some error handling for null labels
        if (label == null) {
            throw new IllegalArgumentException("Label cannot be null");
        }
        if (label.equals(label1)) return circle1;
        if (label.equals(label2)) return circle2;
        if (label.equals(label3)) return circle3;
        // Adding error handling for unknown labels
        throw new IllegalArgumentException("Unknown label: " + label);
    }

    @Override
    public final void add(T item, String... labels) {
        if (labels == null) return;
        for (String lbl : labels) {
            Set<T> s = getCircleForLabel(lbl);
            s.add(item);
        }
    }

    public Set<T> unionOf(String first, String second) {
        Set<T> a = new HashSet<>(getCircleForLabel(first));
        a.addAll(getCircleForLabel(second));
        return a;
    }

    public Set<T> intersectionOf(String first, String second) {
        Set<T> a = new HashSet<>(getCircleForLabel(first));
        a.retainAll(getCircleForLabel(second));
        return a;
    }

    public Set<T> complementOf(String first, String second) {
        Set<T> a = new HashSet<>(getCircleForLabel(first));
        a.removeAll(getCircleForLabel(second));
        return a;
    }

    public Set<T> diagramCenter() {
        Set<T> center = new HashSet<>(circle1);
        center.retainAll(circle2);
        center.retainAll(circle3);
        return center;
    }
}