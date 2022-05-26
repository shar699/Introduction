
package printingstudentdetail;


public class Main {

    
    public static void main(String[] args) {
        // array of object declaration
       Student[] list= new Student[3];
        
        Student s1= new Student();
        s1.setName("John");
        s1.setAge(20);
        
        Student s2=new Student();
        s2.setName("Fred");
        s2.setAge(19);
        
        Student s3= new Student();
        s3.setName("Peter");
        s3.setAge(25);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName()+" "+list[i].getAge());
            System.out.println("Learn Github operators");
            //commit and save
            //pull operations 
            // fetch and merge operations 
            //This is the branch partime
            
        }
        
    }
    
}
