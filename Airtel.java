class Airtel extends Main implements data {

  public Airtel() {

  }

  public Airtel(String detailed, int balance, String[] internet_Packages, String[] social_Package,
      double emergency_Loan, String[] my_Offers, String[] fnf_offers) {
    super(detailed, balance, internet_Packages, social_Package, emergency_Loan, my_Offers, fnf_offers);
  }

  public String[] list = { "I. 2gb 7 tk ", "II. 3gb 30 tk", "III. 1.5gb 20 tk", "IV. 4gb 100 tk" };
  public String[] list2 = { "I. 3gb 20 tk ", "II. 5gb 100 tk", "III. 4.5gb 121 tk", "IV. 4gb 100 tk" };
  public String[] list4 = { " " };
  public String[] list5 = { " 20 Minute FNF offer ", "25 Minute FNF offer " };

  public String offer() {
    return "You can buy 3 gb internet only 30TK for 30 days ";
  }
}