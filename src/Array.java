public class Array {

   static class Student{

        String name;
        int age;

        Student(String name,int age){
            this.age=age;
            this.name=name;

        }

        public  static  void main(String[] args){

           Student[] arr=new Student[5];
           arr[0]=new Student("NOAH",6);

            System.out.println(arr[0].name);


        }



    }





}
