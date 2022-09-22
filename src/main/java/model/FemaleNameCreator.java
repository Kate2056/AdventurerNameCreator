package model;


public class FemaleNameCreator {
	private String firstNameLetter;
	private String birthMonth;
	private int birthDate;
	private String adventureFirstNameF;
	private String adventureFirstHalfLastNameF;
	private String adventureLastHalfLastNameF;
	
	//Constructors
	public FemaleNameCreator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FemaleNameCreator(String firstNameLetter, String birthMonth, int birthDate) {
		super();
		this.firstNameLetter = firstNameLetter;
		this.birthMonth = birthMonth;
		this.birthDate = birthDate;
		setFemaleAdventurerName(firstNameLetter, birthMonth, birthDate);
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

	public String getAdventureFirstNameF() {
		return adventureFirstNameF;
	}

	public void setAdventureFirstNameF(String adventureFirstNameF) {
		this.adventureFirstNameF = adventureFirstNameF;
	}

	public String getAdventureFirstHalfLastNameF() {
		return adventureFirstHalfLastNameF;
	}

	public void setAdventureFirstHalfLastNameF(String adventureFirstHalfLastNameF) {
		this.adventureFirstHalfLastNameF = adventureFirstHalfLastNameF;
	}

	public String getAdventureLastHalfLastNameF() {
		return adventureLastHalfLastNameF;
	}

	public void setAdventureLastHalfLastNameF(String adventureLastHalfLastNameF) {
		this.adventureLastHalfLastNameF = adventureLastHalfLastNameF;
	}
	
	//Methods
	public void setFemaleAdventurerName(String firstNameLetter, String birthMonth, int birthDate) {
		firstNameLetter = firstNameLetter.toLowerCase();
		birthMonth = birthMonth.toLowerCase();
		
		if(firstNameLetter.equals("a") || firstNameLetter.equals("b") || 
				firstNameLetter.equals("c") || firstNameLetter.equals("d")
				|| firstNameLetter.equals("e") || firstNameLetter.equals("f")) {
			setAdventureFirstNameF("Artemis");
		}else if (firstNameLetter.equals("g") || firstNameLetter.equals("h") || 
					firstNameLetter.equals("i") || firstNameLetter.equals("j")
					|| firstNameLetter.equals("k") || firstNameLetter.equals("l")) {
					setAdventureFirstNameF("Lara");
				}else if (firstNameLetter.equals("m") || firstNameLetter.equals("n") || 
						firstNameLetter.equals("o") || firstNameLetter.equals("p")
						|| firstNameLetter.equals("q") || firstNameLetter.equals("r")) {
						setAdventureFirstNameF("Hermione");
					}else setAdventureFirstNameF("Athena");
		
		if(birthMonth.equals("january") || birthMonth.equals("february") 
				|| birthMonth.equals("march")) {
			setAdventureFirstHalfLastNameF("Brave");
		}else if(birthMonth.equals("april") || birthMonth.equals("may") 
				|| birthMonth.equals("june")) {
				setAdventureFirstHalfLastNameF("Spirit");
			}else if(birthMonth.equals("july") || birthMonth.equals("august") 
				|| birthMonth.equals("september")) {
				setAdventureFirstHalfLastNameF("Epic");
				}else if(birthMonth.equals("october") || birthMonth.equals("november") 
						|| birthMonth.equals("december")) {
						setAdventureFirstHalfLastNameF("Hero"); 
						}else setAdventureFirstHalfLastNameF("Strong");
		if(birthDate <= 10) {
			setAdventureLastHalfLastNameF("warrior");
		}else if(birthDate <= 20) {
				setAdventureLastHalfLastNameF("star");
			}else if(birthDate <= 31) {
					setAdventureLastHalfLastNameF("heart");
				}else setAdventureLastHalfLastNameF("knight");
	}
	@Override
	public String toString() {
		return adventureFirstNameF + " " + adventureFirstHalfLastNameF + adventureLastHalfLastNameF;
	}
	
}
