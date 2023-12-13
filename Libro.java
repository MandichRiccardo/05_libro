public class Libro
{
    private String titolo;
    private String autore;
    private int pagine;
    private String editore;
    private int anno;
    private double prezzo;
    private double prezzoScontato;

    public Libro(String titolo, String autore, int pagine, String editore, int anno, double prezzo, double prezzoScontato)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.pagine = pagine;
        this.editore = editore;
        this.anno = anno;
        this.prezzo = prezzo;
    }
    public Libro(Libro l)
    {
        this.titolo = l.titolo;
        this.autore = l.autore;
        this.pagine = l.pagine;
        this.editore = l.editore;
        this.anno = l.anno;
        this.prezzo = l.prezzo;
    }
    public Libro(){
        this.titolo = Main.strput("qual'è il titolo del libro?");
        this.autore = Main.strput("qual'è l'autore del libro?");
        this.pagine = Main.input("quante pagine ha il libro?");
        this.editore = Main.strput("qual'è l'editore?");
        this.anno = Main.input("in che anno è stato scritto?");
        this.prezzo = Main.douput("qual'è il prezzo di questo libro?");
        Main.output("fine input costruttore\n###########################################\n");
    }

    public String getTitolo()
    {
        return this.titolo;
    }
    
    public String getAutore()
    {
        return this.autore;
    }
    
    public int getPagine()
    {
        return this.pagine;
    }
    
    public String getEditore()
    {
        return this.editore;
    }
    
    public int getAnno()
    {
        return this.anno;
    }
    
    public double getPrezzo(){
        return this.prezzo;
    }
    
    public double getPrezzoScontato(){
        return this.prezzoScontato;
    }
    
    public void sconta(int annoAttuale){
        int sconto = 0;
        if(annoAttuale-this.anno>=3){
            sconto = 10;
        }
        this.prezzoScontato = this.prezzo-(this.prezzo/100)*sconto;
    }
    
    public boolean ugualeA(Libro l){
        if(this.titolo != l.titolo)
            return false;
        if(this.autore != l.autore)
            return false;
        if(this.editore != l.editore)
            return false;
        if(this.anno != l.anno)
            return false;
        return true;
    }
    
    public String getInfoLibro(){
        String info = "Titolo:\t\t\t"+getTitolo();
        info += "\nautore:\t\t\t"+getAutore();
        info += "\npagine:\t\t\t"+getPagine();
        info += "\neditore:\t\t"+getEditore();
        info += "\nanno:\t\t\t"+getAnno();
        info += "\nprezzo totale:\t\t"+getPrezzo();
        info += "\nprezzo scontato:\t"+getPrezzoScontato()+"\n";
        return info;
    }
}