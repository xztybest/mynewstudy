public class sqlformatout {
    public static void main(String[] args){
        String username="hello";
        String id="001";
        System.out.println(String.format("select username from %s where x=\"%s\"",username,id));
    }
}
