import javax.swing.JOptionPane;
public class Example601 {

	public static void main(String[] args) {
			inputEmail();
		}
	
		public static void inputEmail() {
			//1. input email from dialog box
			String inputEmail = JOptionPane.showInputDialog("Input your e-mail : ")
					.toLowerCase();
			
			while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) {
				inputEmail=JOptionPane.showInputDialog("Input your e-mail,again : ");
			}
			
			boolean validateEmail = cheakEmail(inputEmail);
			if(validateEmail==true) {
				JOptionPane.showMessageDialog(null,"Your email is " + inputEmail);
			}
			else {
				JOptionPane.showMessageDialog(null,
						"Your email is not hotmail or gmail dot com ");
	}
		}
	public static boolean cheakEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else  return false;
	}
	

}
