class Student extends LibCard {
        String group;
        String institute;

        @Override
        public void getNumberBook(){
            System.out.println("Студент має: " + numberBook + " книг");
        }

        public void getGroup(){
            System.out.println("Група: " + group);
        }

        public void getInstitute(){
            System.out.println("Інститут: " + institute);
        }
    }
