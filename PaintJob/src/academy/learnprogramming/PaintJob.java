package academy.learnprogramming;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if (extraBucket < 0 || width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double areaLeft = width * height - extraBucket * areaPerBucket;
        if (areaLeft < 0){
            return 0;
        }else {
            return (int)Math.ceil(areaLeft / areaPerBucket);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        return (int)Math.ceil(width * height / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        return (int)Math.ceil(area / areaPerBucket);
    }

}
