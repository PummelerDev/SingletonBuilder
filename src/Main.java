public class Main {
    public static void main(String[] args) {
        Protagonist protagonist =
                new Protagonist.Builder("name").withLevel(1).withHp(1000).build();
        protagonist.setLevel(2);
        Protagonist protagonist1 = new Protagonist.Builder("dsadsd").build();
        protagonist1.setLevel(44);
        System.out.println(protagonist);
        System.out.println(protagonist1);

    }
}
