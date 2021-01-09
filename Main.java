// Interface 
interface data {
  // abstract method
  public String offer();

}

public class Main {

  public String number;
  public String Detailed;
  public double Balance;
  public String[] Internet_Packages = new String[10];
  public String[] Social_Package = new String[10];
  public double Emergency_Loan;
  public String[] My_Offers = new String[10];
  public String[] FNF_Offers = new String[5];
  public String[] info = new String[8];
  public String BackInfo;

  public Main() {

  }

  public Main(String[] list) {
    this.info = list;
  }

  public Main(String detailed, int balance, String[] internet_Packages, String[] social_Package, double emergency_Loan,
      String[] my_Offers, String[] fnf_offers) {
    Detailed = detailed;
    Balance = balance;
    Internet_Packages = internet_Packages;
    Social_Package = social_Package;
    Emergency_Loan = emergency_Loan;
    My_Offers = my_Offers;
    FNF_Offers = fnf_offers;
  }

  public String getDetailed() {
    return Detailed;
  }

  public void setDetailed(String detailed) {
    Detailed = detailed;
  }

  public double getBalance() {
    return Balance;
  }

  public void setBalance(int balance) {
    Balance = balance;
  }

  public String[] getInternet_Packages() {
    return Internet_Packages;
  }

  public void setInternet_Packages(String[] internet_Packages) {
    Internet_Packages = internet_Packages;
  }

  public String[] getSocial_Package() {
    return Social_Package;
  }

  public void setSocial_Package(String[] social_Package) {
    Social_Package = social_Package;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public double getEmergency_Loan() {
    return Emergency_Loan;
  }

  public void setEmergency_Loan(double emergency_Loan) {
    Emergency_Loan = emergency_Loan;
  }

  public String[] getMy_Offers() {
    return My_Offers;
  }

  public void setMy_Offers(String[] my_Offers) {
    My_Offers = my_Offers;
  }

  public String[] getInfo() {
    return info;
  }

  public void setInfo(String[] info) {
    this.info = info;
  }

  public double add(double num) {
    return this.Balance = this.Balance + num;
  }

  public double remove(double num) {
    return this.Balance = this.Balance - num;
  }

  public String getBackInfo() {
    return BackInfo;
  }

  public void setBackInfo(String backInfo) {
    BackInfo = backInfo;
  }

  public String[] getFNF_Offers() {
    return FNF_Offers;
  }

  public void setFNF_Offers(String[] fNF_Offers) {
    FNF_Offers = fNF_Offers;
  }

}