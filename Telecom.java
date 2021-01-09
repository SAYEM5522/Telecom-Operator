import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Telecom Class
public class Telecom {
  public static String txt;

  public static void main(String[] args) {
    String[] listA = { "1.Details", "2.Balance", "3. Internet Packages", "4. Social Packages", "5. Emergency Loan",
        "6. My Offers", "7. FnF Offers", "8. Back", "9. Exit" };

    Main m = new Main(listA);

    txt = "<html>" + "<h3>" + m.info[0] + "</h3>" + "<br>" + "<h3>" + m.info[1] + "</h3>" + "<h3>" + m.info[2] + "</h3>"
        + "<h3>" + m.info[3] + "</h3>" + "<h3>" + m.info[4] + "</h3>" + "<h3>" + m.info[5] + "</h3>" + "<h3>"
        + m.info[6] + "</h3>" + "<h3>" + m.info[7] + "</h3>" + "<h3>" + m.info[8] + "</h3>" + "</html>";

    JFrame jfram = new JFrame("Telecom Operator");
    jfram.setDefaultCloseOperation(jfram.EXIT_ON_CLOSE);
    ImageIcon icon = new ImageIcon("icon1.jpg");
    jfram.setIconImage(icon.getImage());
    JLabel jlabel = new JLabel(
        "<html><h1>Choose Your Operator</h1><h2>1.Airtel</h2><br><h2>2.Banglalink</h2><br><h2>3.Robi</h2></html>");

    // input field
    String h = "<h3>";
    String h1 = "<h3/>";
    JTextField pass;

    pass = new JTextField();

    pass.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        String input = pass.getText();

        m.setNumber(input);

        // Airtel Package List ..............

        if (m.getNumber().equals("*5000#")) {

          Airtel a = new Airtel();
          Main A = new Airtel("abc", 50, a.list, a.list2, 60, a.list4, a.list5);
          A.setBackInfo(txt);

          pass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              String input2 = pass.getText();
              System.out.println(input2);
              if (Integer.parseInt(input2) == 1) {
                jlabel.setText("Your Mobile Number : 016" + Math.round(Math.random() * 100000000));
              }

              else if (Integer.parseInt(input2) == 2) {

                jlabel.setText("Your Balance is: " + A.getBalance());

              } else if (Integer.parseInt(input2) == 3) {

                // inside

                pass.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                    String input3 = pass.getText();
                    m.setNumber(input3);
                    String t;
                    double d;
                    switch (m.getNumber()) {

                      case "I":
                        t = "Your Have Got " + a.list[0].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(a.list[0].split(" ")[2]);

                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          A.remove(d);
                          JOptionPane.showMessageDialog(null, t);
                          // throw new java.lang.NumberFormatException:

                        }
                        break;

                      case "II":
                        t = "Your Have Got," + a.list[1].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(a.list[1].split(" ")[2]);

                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          A.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }

                        break;
                      case "III":
                        t = "Your Have Got," + a.list[2].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(a.list[2].split(" ")[2]);

                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          A.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }

                        break;
                      case "IV":
                        t = "Your Have Got," + a.list[3].split(" ")[1] + " internet Pckage ";

                        d = Double.parseDouble(a.list[3].split(" ")[2]);

                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          A.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }

                        break;
                      default:
                        jlabel.setText("You Have Entered A Wrong Input  ");
                        break;
                    }
                  }

                });

                String i = "<html>" + h + A.Internet_Packages[0] + h1 + "<br>" + h + A.Internet_Packages[1] + h1
                    + "<br>" + h + A.Internet_Packages[2] + h1 + "<br>" + h + A.Internet_Packages[3] + h1 + "</html>";
                jlabel.setText(i);
              }

              else if (Integer.parseInt(input2) == 4) {

                pass.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                    String input4 = pass.getText();
                    m.setNumber(input4);
                    String t;
                    double d;

                    switch (m.getNumber()) {
                      case "I":
                        t = "Your Have Got " + a.list2[0].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(a.list2[0].split(" ")[2]);

                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;

                        } else {
                          A.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "II":
                        t = "Your Have Got " + a.list2[1].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(a.list2[1].split(" ")[2]);
                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;

                        } else {
                          A.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "III":
                        t = "Your Have Got " + a.list2[2].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(a.list2[2].split(" ")[2]);

                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;

                        } else {
                          JOptionPane.showMessageDialog(null, t);
                          A.remove(d);
                        }
                        break;
                      case "IV":
                        t = "Your Have Got " + a.list2[3].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(a.list2[3].split(" ")[2]);

                        if (d > A.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;

                        } else {
                          JOptionPane.showMessageDialog(null, t);
                          A.remove(d);

                        }
                        break;
                      default:
                        jlabel.setText("You Have Entered A Wrong Input  ");
                        break;
                    }
                  }

                });
                String i = "<html>" + h + A.Social_Package[0] + h1 + "<br>" + h + A.Social_Package[1] + h1 + "<br>" + h
                    + A.Social_Package[2] + h1 + "<br>" + h + A.Social_Package[3] + h1 + "</html>";
                jlabel.setText(i);

              } else if (Integer.parseInt(input2) == 5) {
                jlabel.setText("You have got " + A.getEmergency_Loan() + " Taka for your Emergency Loan");
                A.add(A.getEmergency_Loan());
              } else if (Integer.parseInt(input2) == 6) {
                jlabel.setText("<html>" + "<h3>" + a.offer() + "</h3>" + "</html>");
              } else if (Integer.parseInt(input2) == 7) {
                jlabel.setText("<html>" + "<h3>" + a.list5[0] + "</h3>" + "</br>" + "<h3>" + a.list5[1] + "</h3>");
              }

              else if (Integer.parseInt(input2) == 8) {
                jlabel.setText(A.getBackInfo());

              } else if (Integer.parseInt(input2) == 9) {
                System.exit(0);
              }

            }

          });

          jlabel.setText(txt);

        }

        // Banglalink Package List ............

        else if (m.getNumber().equals("*500#")) {

          Banglalink ban = new Banglalink();
          Main B = new Banglalink(null, 100, ban.list, ban.list2, 20, ban.list4, ban.list5);

          B.setBackInfo(txt);

          jlabel.setText(txt);

          pass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              int input2 = Integer.parseInt(pass.getText());
              if (input2 == 1) {
                jlabel.setText("Your Mobile Number : 019" + Math.round(Math.random() * 100000000));
              } else if (input2 == 2) {
                jlabel.setText("you balance is " + B.getBalance());

              } else if (input2 == 3) {

                pass.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                    String input3 = pass.getText();
                    m.setNumber(input3);
                    String t;
                    double d;

                    switch (m.getNumber()) {
                      case "I":
                        t = "Your Have Got " + ban.list[0].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(ban.list[0].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;

                      case "II":
                        t = "Your Have Got " + ban.list[1].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(ban.list[1].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "III":
                        t = "Your Have Got " + ban.list[2].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(ban.list[2].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "IV":
                        t = "Your Have Got " + ban.list[3].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(ban.list[3].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      default:
                        jlabel.setText("You Have Entered A Wrong Input  ");
                    }
                  }

                });

                String i = "<html>" + h + B.Internet_Packages[0] + h1 + "<br>" + h + B.Internet_Packages[1] + h1
                    + "<br>" + h + B.Internet_Packages[2] + h1 + "<br>" + h + B.Internet_Packages[3] + h1 + "</html>";
                jlabel.setText(i);

              } else if (input2 == 4) {

                pass.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                    String input3 = pass.getText();
                    m.setNumber(input3);
                    String t;
                    double d;

                    switch (m.getNumber()) {
                      case "I":
                        t = "Your Have Got " + ban.list2[0].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(ban.list2[0].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;

                      case "II":
                        t = "Your Have Got " + ban.list2[1].split(" ")[1] + " Social Package";
                        d = Double.parseDouble(ban.list2[1].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "III":
                        t = "Your Have Got " + ban.list2[2].split(" ")[1] + " Social Package";
                        d = Double.parseDouble(ban.list2[2].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "IV":
                        t = "Your Have Got " + ban.list2[3].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(ban.list2[3].split(" ")[2]);

                        if (d > B.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          B.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      default:
                        jlabel.setText("You Have Entered A Wrong Input  ");
                    }
                  }

                });

                String i = "<html>" + h + B.Social_Package[0] + h1 + "<br>" + h + B.Social_Package[1] + h1 + "<br>" + h
                    + B.Social_Package[2] + h1 + "<br>" + h + B.Social_Package[3] + h1 + "</html>";
                jlabel.setText(i);

              } else if (input2 == 5) {
                jlabel.setText("You have got " + B.getEmergency_Loan() + " Taka for your Emergency Loan");
                B.add(B.getEmergency_Loan());
              } else if (input2 == 6) {
                jlabel.setText("<html>" + "<h3>" + ban.offer() + "</h3>" + "</html>");

              } else if (input2 == 7) {
                jlabel.setText("<html>" + "<h3>" + ban.list5[0] + "</h3>" + "</html>");
              }

              else if (input2 == 8) {
                jlabel.setText(B.getBackInfo());
              } else if (input2 == 9) {
                System.exit(0);
              }
            }

          });

        }

        // Robi Package List..............

        else if (m.getNumber().equals("*121#")) {
          Robi robi = new Robi();
          Main R = new Robi(null, 80, robi.list, robi.list2, 20, robi.list4, robi.list5);
          R.setBackInfo(txt);
          jlabel.setText(txt);
          pass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              int input2 = Integer.parseInt(pass.getText());
              if (input2 == 1) {
                jlabel.setText("Your Mobile Number : 018" + Math.round(Math.random() * 100000000));
              }
              if (input2 == 2) {

                jlabel.setText("you balance is " + R.getBalance());

              }

              else if (input2 == 3) {

                pass.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                    String input3 = pass.getText();
                    m.setNumber(input3);
                    String t;
                    double d;

                    switch (m.getNumber()) {
                      case "I":
                        t = "Your Have Got " + robi.list[0].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(robi.list[0].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;

                      case "II":
                        t = "Your Have Got " + robi.list[1].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(robi.list[1].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "III":
                        t = "Your Have Got " + robi.list[2].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(robi.list[2].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "IV":
                        t = "Your Have Got " + robi.list[3].split(" ")[1] + " internet Pckage ";
                        d = Double.parseDouble(robi.list[3].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      default:
                        jlabel.setText("You Have Entered A Wrong Input  ");
                    }
                  }

                });

                String i = "<html>" + h + R.Internet_Packages[0] + h1 + "<br>" + h + R.Internet_Packages[1] + h1
                    + "<br>" + h + R.Internet_Packages[2] + h1 + "<br>" + h + R.Internet_Packages[3] + h1 + "</html>";
                jlabel.setText(i);

              }

              else if (input2 == 4) {

                pass.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                    String input3 = pass.getText();
                    m.setNumber(input3);
                    String t;
                    double d;

                    switch (m.getNumber()) {
                      case "I":
                        t = "Your Have Got " + robi.list2[0].split(" ")[1] + " Social Package  ";
                        d = Double.parseDouble(robi.list2[0].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;

                      case "II":
                        t = "Your Have Got " + robi.list2[1].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(robi.list2[1].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "III":
                        t = "Your Have Got " + robi.list2[2].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(robi.list2[2].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      case "IV":
                        t = "Your Have Got " + robi.list2[3].split(" ")[1] + " Social Package ";
                        d = Double.parseDouble(robi.list2[3].split(" ")[2]);

                        if (d > R.Balance) {
                          jlabel.setText("You can't buy this pack ");
                          break;
                        } else {
                          R.remove(d);
                          JOptionPane.showMessageDialog(null, t);

                        }
                        break;
                      default:
                        jlabel.setText("You Have Entered A Wrong Input  ");
                    }
                  }

                });

                String i = "<html>" + h + R.Social_Package[0] + h1 + "<br>" + h + R.Social_Package[1] + h1 + "<br>" + h
                    + R.Social_Package[2] + h1 + "<br>" + h + R.Social_Package[3] + h1 + "</html>";
                jlabel.setText(i);

              } else if (input2 == 5) {
                jlabel.setText("You have got " + R.getEmergency_Loan() + " Taka for your Emergency Loan");
                R.add(R.getEmergency_Loan());
              } else if (input2 == 6) {
                jlabel.setText("<html>" + "<h3>" + robi.list4[0] + "</h3>" + "</html>");

              } else if (input2 == 7) {
                jlabel.setText("<html>" + "<h3>" + robi.list5[0] + "</h3>" + "</br>" + "<h3>" + robi.list5[1] + "<h3>"
                    + robi.list5[2] + "</h3>" + "</html");
              }

              else if (input2 == 8) {
                jlabel.setText(R.getBackInfo());
              } else if (input2 == 9) {
                System.exit(0);
              }
            }

          });

        }

      }

    });
    jfram.add(pass, BorderLayout.SOUTH);
    jfram.setVisible(true);
    jfram.pack();
    jfram.setSize(400, 600);
    jlabel.setVerticalAlignment(jlabel.CENTER);
    jlabel.setHorizontalAlignment(jlabel.CENTER);
    jfram.getContentPane().setBackground(Color.orange);
    jfram.add(jlabel);
    jfram.setResizable(true);

  }
}
