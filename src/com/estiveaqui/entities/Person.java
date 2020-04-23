/*** ***************************************************************************
 * CONTENT: ESTIVEAQUI PROJECT (ITWBP-EA).
 * THEME: WEB-BASED IMMOBILIARE BUSINESS, JAVA FUNDAMENTALS, JDBC, JSF, JPA,_
 * 		_HYBERNATES.
 * AUTHOR: RONALDO PI MA SI.
 * DATE: 2019-AUGUST.
 * LANGUAGE: JAVA 8.
 * PLATAFORM: Microsoft Windows7, JDK 8.0.212, Eclipse IDE for Enterprise Java_
 * 		_Developers, version 2019-03.
 *
 * NOTA IMPORTANTE / ISENÇÃO DE RESPONSABILIDADE:
 * Este é um projeto pessoal, particular, de uso e fruto único e exclusivamente
 * de seu autor. Trata-se de um projeto em faze de desenvovimento e experimenta-
 * -ções. O qual não tem nenhuma responsabilidade pelas informações nele conti-
 * -das, tão pouco sobre seus resultados e efeitos ao ser utilizado. 
 * 
 * IMPORTANT NOTE / DISCLAIMER:
 * This is a personal project, private, for use and fruit solely and exclusively
 * by its author. It is a project in development and experimentation. Which has
 * no responsibility for the information contained therein, nor for its results
 * and effects when used.
*************************************************************************** ***/

// Project's package
package estiveaqui.classes;

// Java's imports

// Project's imports

public abstract class Person {

	// ### CLASS' PROPERTIES ###
	// Class' Vars & Controls.
	private static long instanceQty = 0L;
	private boolean enable = false;
	private String id = "";

	// Getters & Setters of this session.
	/***
	 * @return the 'instanceQty', the current quantity of variables instantiated
	 *         from this class. Used on runtime controls. There is no respective
	 *         setter, as it is implicit in the constructor.
	 ***/
	public static long getInstanceQty() {
		return instanceQty;
	}

	/***
	 * @return the enable, the current status of this object instantiated. Used on
	 *         runtime controls. Its respectives setters pair are 'enable()' and
	 *         'disable()'.
	 ***/
	public boolean isEnable() {
		return this.enable;
	}

	/***
	 * There is no @param. This method turns enable 'true' for this object
	 * instantiated. Used on runtime controls. Its respective getter is
	 * 'isEnable()'. And its oppsite setter is 'disable()'.
	 ***/
	public void enable() {
		this.enable = true;
	}

	/***
	 * There is no @param. This method turns enable 'false' for this object
	 * instantiated. Used on runtime controls. Its respective getter is
	 * 'isEnable()'. And its oppsite setter is 'enable()'.
	 ***/
	public void disable() {
		this.enable = false;
	}

	/***
	 * @return the 'id', the current identification for this object instantiated
	 *         from this class. Used on runtime controls. There is no respective
	 *         setter, as it is implicit in the constructor.
	 ***/
	public String getId() {
		return this.id;
	}

	// About Person it self.
	private String firstName = "";
	private String remainingName = "";

	// Getters & Setters of this session.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getRemainingName() {
		return remainingName;
	}

	public void setRemainingName(String remainingName) {
		this.remainingName = remainingName;
	}
	
	public String getFullName() { // There is no setter pair for this getter.
		return firstName +" "+ remainingName;
	}

	// Constructors.
	public Person() {
		System.out.println("Constructor Person()");
		instanceQty++; // Add 1 in the amount of instanced objects of this class.
		this.id = this.getClass().getName() + String.valueOf(getInstanceQty());
		this.enable();
	}

	public Person(String firstName) {
		System.out.println("Constructor Person(firstName)");
		instanceQty++; // Add 1 in the amount of instanced objects of this class.
		this.id = this.getClass().getName() + String.valueOf(getInstanceQty());
		this.enable();
		this.setFirstName(firstName);
	}

	public Person(String firstName, String remainingName) {
		System.out.println("Constructor Person(firtName, remainingName)");
		instanceQty++; // Add 1 in the amount of instanced objects of this class.
		this.id = this.getClass().getName() + String.valueOf(getInstanceQty());
		this.enable();
		this.setFirstName(firstName);
		this.setRemainingName(remainingName);
	}
}
 
 
