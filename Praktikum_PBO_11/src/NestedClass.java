class NestedClass {
    String nama = "Fariz Taufiqul Hafidz"; // lengkapi dengan nama saudara
    String nim = "L200210192"; // lengkapi dengan nim saudara

    public void printNama() {
        System.out.println (
            "Nama : " + nama + "\n" +
            "NIM : " + nim
        );
    }

    static class StaticNestedClass {
        static String jurusan = "Informatika";
        public void info() {
            NestedClass nested = new NestedClass();
                nested.printNama();
        }     
    }
          
    class InnerClass {
        public void infoProdi() {
            System.out.println ("Jurusan : " + StaticNestedClass.jurusan);
        }

    }
}