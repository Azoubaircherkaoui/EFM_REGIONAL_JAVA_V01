public class ArticleEnSolde extends Article {
    private int remise;

    public ArticleEnSolde(int code, double prixOrigine) {
        super(code, prixOrigine);
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        if (remise < 0 || remise > 90) {
            throw new IllegalArgumentException("La remise doit être comprise entre 0 et 90.");
        }
        this.remise = remise;
    }
    public ArticleEnSolde(int code, double prixOrigine, int remise) {
        super(code, prixOrigine);
        setRemise(remise);
    }
    @Override
    public double prixArticle() {
        return getPrixOrigine() * (1 - (double) getRemise() / 100);
    }
    @Override
    public String toString() {
        return getCode() + ";" + getPrixOrigine() + ";" + getRemise();
    }

}
