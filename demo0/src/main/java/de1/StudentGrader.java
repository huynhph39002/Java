package de1;

public class StudentGrader {
    public String phanLoai(int diem) {
        if (0 < diem && diem < 40) {
            return "F";
        } else if (41 < diem && diem < 60) {
            return "D";
        } else if (61 < diem && diem < 70) {
            return "C";
        } else if (71 < diem && diem < 80) {
            return "B";
        } else if (81 < diem && diem < 100) {
            return "A";
        } else {
//            throw new IllegalArgumentException("khong hop le");
        return "khong hop le";
        }
    }
}