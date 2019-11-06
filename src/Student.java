public class Student {
    public Course course;
    private String fname;
    private String lname;
    private long id;
 public Transcript transcript;

    public Student() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }


}
