
class Banglalink extends Main implements data {

  public Banglalink() {
  }

  public Banglalink(String[] list) {
    super(list);
  }

  public Banglalink(String detailed, int balance, String[] internet_Packages, String[] social_Package,
      double emergency_Loan, String[] my_Offers, String[] fnf_offers) {
    super(detailed, balance, internet_Packages, social_Package, emergency_Loan, my_Offers, fnf_offers);
  }

  public String[] list = { "I. 3GB 100 tk ", "II. 1GB 50 tk", "III. 500MB 15 tk", "IV. 5GB 120 tk" };
  public String[] list2 = { "I. 3GB 60 tk ", "II. 5GB 150 tk", "III. 100MB  10 tk", "IV. 4GB 120 tk" };
  public String[] list4 = { "" };
  public String[] list5 = { "Your FNF Offers Are Currently Unreachable" };

  public String offer() {

    return "You can buy 2GB internet only 20TK for 10 days";
  }

}
