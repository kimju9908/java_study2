package 학생성적정렬하기;

public class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int total;

    @Override
    public int compareTo(Student o) {

        if (this.getTotal() != o.getTotal()) {
            return o.getTotal()-this.getTotal(); // 뒤에 값이 큰 경우가 양수가 됨
        }
        else  return this.name.compareTo(o.name);


    }

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKorean(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTotal() {
        return kor+eng+mat;
    }
    public void setTotal(int total) {
        this.total = total;
    }
}