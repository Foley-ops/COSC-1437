class Bank implements Interest{
    private int principal;
    private float year;

    public Bank (int principal, float year) {
        this.principal = principal;
        this.year = year;
    }
    public double simpleInterest() {
        return principal * year * rate / 100;
    }
    public double compInterest() {
        return principal * Math.pow(( 1 + rate / 100 ), year) - principal;
    }


}
