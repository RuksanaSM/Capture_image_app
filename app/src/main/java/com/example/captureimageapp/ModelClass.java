package com.example.captureimageapp;

public class ModelClass {

        private String courseName;
        private int image;


//    public ModelClass(String courseName) {
//        this.courseName = courseName;
//    }

    // creating getter and setter methods.
        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

    public ModelClass(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

