package printingstudentdetail;

/**
 * model1 
 * @author Naman Sharma
 */

public class Student {
    
    private String name;
    private int age;
    private boolean parttime;

    /**
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the parttime
     */
    public boolean isParttime() {
        return parttime;
    }

    /**
     * @param parttime the parttime to set
     */
    public void setParttime(boolean parttime) {
        this.parttime = parttime;
    }
    
    
}
