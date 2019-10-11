
public class Age {
	
	
	private int years, months, days;

	@Override
	public String toString() {
		return "Age [years=" + years + ", months=" + months + ", days=" + days + "]";
	}

	public Age(int years, int months, int days) {
		super();
		this.years = years;
		this.months = months;
		this.days = days;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		if(years > 0 )
			this.years = years;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		if (months <= 12 && months >= 0)
			this.months = months;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		if(days >= 0 && days <= 31)
			this.days = days;
	}
	
	

	

}
