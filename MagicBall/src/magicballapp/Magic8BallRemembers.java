package magicballapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
//import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Magic8BallRemembers extends Magic8Ball {
	
	
		ArrayList<String> questions = new ArrayList<String>();
		ArrayList<String> answers = new ArrayList<String>();
		
		public ArrayList<String> getQuestions() {
			return questions;
		}


		public void setQuestions(ArrayList<String> questions) {
			this.questions = questions;
		}


		public ArrayList<String> getAnswers() {
			return answers;
		}


		public void setAnswers(ArrayList<String> answers) {
			this.answers = answers;
		}


	
		public void displayHistory() {
			int i = 0;
			for (String qes :  questions) {				
				String ans = this.getAnswers().get(i);
				i++;
				System.out.println("The " + i + "th Question is:  " + qes + "\n" +
										   "The " + i + "th Answer is:    " + ans);
				
			}
		}
}
