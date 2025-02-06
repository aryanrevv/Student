//Student.java

class Student{
    private String name;
    private long prn;
    private String branch;
    private float cgpa;
    public Student(String name, long prn, String branch, float cgpa){
        setName(name);
        setPRN(prn);
        setBranch(branch);
        setCGPA(cgpa);
     
    }
    
    public String getName(){
    return name;
    }
    
    public String getBranch(){
    return branch;
    }

    public float getCGPA(){
        return cgpa;
        }
        
        public long getPRN(){
        return prn;
        }
    public void setName(String name){
    this.name = name;
    }
    
    public void setPRN(long prn){
    this.prn = prn ;
    }

    public void setBranch(String branch){
        this.branch = branch;
        }
        
        public void setCGPA(float cgpa){
        this.cgpa = cgpa;
        }
        
    
    public void display(){
        System.out.println("Name: "+getName()+ " PRN: "+getPRN() +" Branch: "+getBranch()+" CGPA: " +getCGPA());
    }
}