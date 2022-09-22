/**
 * Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Sep 22, 2022
 */
package model;

public class NameCreator {
	private String firstNameLetter;
	private String birthMonth;
	private int birthDate;
	private String adventureFirstName;
	private String adventureFirstHalfLastName;
	private String adventureLastHalfLastName;
	
	//Constructors
	public NameCreator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NameCreator(String firstNameLetter, String birthMonth, int birthDate) {
		super();
		this.firstNameLetter = firstNameLetter;
		this.birthMonth = birthMonth;
		this.birthDate = birthDate;
		setAdventurerName(firstNameLetter, birthMonth, birthDate);
	}

	//Getters and Setters
	public String getFirstNameLetter() {
		return firstNameLetter;
	}

	public void setFirstNameLetter(String firstNameLetter) {
		this.firstNameLetter = firstNameLetter;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public String getAdventureFirstName() {
		return adventureFirstName;
	}

	public void setAdventureFirstName(String adventureFirstName) {
		this.adventureFirstName = adventureFirstName;
	}

	public String getAdventureFirstHalfLastName() {
		return adventureFirstHalfLastName;
	}

	public void setAdventureFirstHalfLastName(String adventureFirstHalfLastName) {
		this.adventureFirstHalfLastName = adventureFirstHalfLastName;
	}

	public String getAdventureLastHalfLastName() {
		return adventureLastHalfLastName;
	}

	public void setAdventureLastHalfLastName(String adventureLastHalfLastName) {
		this.adventureLastHalfLastName = adventureLastHalfLastName;
	}
	
	//Methods
	public void setAdventurerName(String firstNameLetter, String birthMonth, int birthDate) {
		firstNameLetter = firstNameLetter.toLowerCase();
		birthMonth = birthMonth.toLowerCase();
		
		if(firstNameLetter.equals("a") || firstNameLetter.equals("b") || 
				firstNameLetter.equals("c") || firstNameLetter.equals("d")
				|| firstNameLetter.equals("e") || firstNameLetter.equals("f")) {
			setAdventureFirstName("Hercules");
		}else if (firstNameLetter.equals("g") || firstNameLetter.equals("h") || 
					firstNameLetter.equals("i") || firstNameLetter.equals("j")
					|| firstNameLetter.equals("k") || firstNameLetter.equals("l")) {
					setAdventureFirstName("Robin");
				}else if (firstNameLetter.equals("m") || firstNameLetter.equals("n") || 
						firstNameLetter.equals("o") || firstNameLetter.equals("p")
						|| firstNameLetter.equals("q") || firstNameLetter.equals("r")) {
						setAdventureFirstName("Indiana");
					}else setAdventureFirstName("Sawyer");
		
		if(birthMonth.equals("january") || birthMonth.equals("february") 
				|| birthMonth.equals("march")) {
			setAdventureFirstHalfLastName("Brave");
		}else if(birthMonth.equals("april") || birthMonth.equals("may") 
				|| birthMonth.equals("june")) {
				setAdventureFirstHalfLastName("Spirit");
			}else if(birthMonth.equals("july") || birthMonth.equals("august") 
				|| birthMonth.equals("september")) {
				setAdventureFirstHalfLastName("Epic");
				}else if(birthMonth.equals("october") || birthMonth.equals("november") 
						|| birthMonth.equals("december")) {
						setAdventureFirstHalfLastName("Hero"); 
						}else setAdventureFirstHalfLastName("Strong");
		if(birthDate <= 10) {
			setAdventureLastHalfLastName("warrior");
		}else if(birthDate <= 20) {
				setAdventureLastHalfLastName("star");
			}else if(birthDate <= 31) {
					setAdventureLastHalfLastName("heart");
				}else setAdventureLastHalfLastName("knight");
	}
	@Override
	public String toString() {
		return adventureFirstName + " " + adventureFirstHalfLastName + adventureLastHalfLastName;
	}
	
}
