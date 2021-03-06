package ua.edu.sumdu.j2se.myropolska.anna.tasks;

import java.io.Serializable;
import java.util.Iterator;

abstract public class TaskList implements Iterable<Task>, Serializable {
    public int size;
    abstract void add(Task task);
    abstract public boolean remove(Task task);
    abstract public Task getTask(int index);
    abstract public Iterator <Task> iterator();
    public int size() {
        return size;
    }
}

