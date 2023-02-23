public class Article {
    private int code;
    private double prixOrigine;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }
    public Article(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }
    @Override
    public String toString() {
        return code + ";" + prixOrigine;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Article article = (Article) obj;
        return code == article.code;
    }
    public double prixArticle() {
        return prixOrigine;
    }

}
