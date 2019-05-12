package com.dhawan;

public class Main {

    public static void main(String[] args) {
        getBucketCount(-3.4, 2.1, 1.5, 2);
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(2.75, 3.25, 2.5,1);

        getBucketCount(-3.4, 2.1, 1.5);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(7.25, 4.3, 2.35);

        getBucketCount(3.4, 1.5);
        getBucketCount(6.26, 2.2);
        getBucketCount(3.26, 0.75);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            System.out.println("Count = -1");
            return -1;
        } else {
            double totalArea = width * height;
            double areaRemaining = totalArea - (extraBuckets * areaPerBucket);
            double initialCount = Math.ceil((areaRemaining / areaPerBucket));
            int bucketCount = (int) (initialCount);
            System.out.println("Count = " + bucketCount);
            return bucketCount;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            System.out.println("Count = -1");
            return -1;
        } else {
            double totalArea = width * height;
            double initialCount = Math.ceil((totalArea / areaPerBucket));
            int bucketCount = (int) initialCount;
            System.out.println("Count = " + bucketCount);
            return bucketCount;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            System.out.println("Count = -1");
            return -1;
        } else {
            double initialCount = Math.ceil((area / areaPerBucket));
            int bucketCount = (int) initialCount;
            System.out.println("Count = " + bucketCount);
            return bucketCount;
        }
    }
}
