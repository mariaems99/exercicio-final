public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO ");
        v[1] = new Video("Aula de PHP ");
        v[2] = new Video("Aula de HTML5");
        System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Helena",30, "F", "helena");
        g[1] = new Gafanhoto("João",35 ,"M","joao" );

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());
        





    }
}
