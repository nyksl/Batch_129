package day22staticblocksconstructors;


        /*
        Constructor nedir?
        Class'dan object  uretmemize yarayan code block'laridir.

       Class olusturdugumuzda Java bize otomatik olarak bir Constractor verir.
       Ama bu constractor gozle gorulmez, gozle gorulmeyen otomatik olarak Java tarafindan verilen bu Constractor'lara
       "default constractor" denir.

       "default constractor" lar "Car(){}" seklindedir.

       Siz kendi constructor'larinizi olusturdugunuzda Java default constructor'i siler

       Bir Class'da farkli parametreler kullanarak istediginiz kadar Constructor olusturabilirsiniz.

       Farkli constractor'lar sayesinde bir class'dan farkli farkli object'ler olusturabiliriz.

       Interview sorusu : Method ile constructor'in farki varmidir? varsa nedir?
       Cevap:             Method ile constructor farkli yapilardir.
                   i)Method'larda return type vardir ama constructor'larda return type yoktur
                   ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                      Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.
        */

        public class Car {

        String make = "Honda";
        String model= "Accord";
        int year = 2023;
        boolean hybrid = true;

        public Car(String make, String model, int year, boolean hybrid){
            this.make=make;
            this.model=model;
            this.year=year;
            this.hybrid=hybrid;
        }
       public Car(String make, String model){
            this.make=make;
            this.model=model;
            if (year==2023){
                this.year=0;
                this.hybrid=false;
            }
            if (hybrid==true){
                this.hybrid=false;
            }
        }

            public Car(String make, int year) {
                this.make = make;
                this.year = year;
            }

            @Override
            public String toString() {
                return "Car{" +
                        "make='" + make + '\'' +
                        ", model='" + model + '\'' +
                        ", year=" + year +
                        ", hybrid=" + hybrid +
                        '}';
            }
        }

