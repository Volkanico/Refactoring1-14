package com.company;

public class /*Student*/ ReplaceTempWithQuery {
/* Es pareix al refactoring de Extract Method */

        private String name;
        private boolean hasGoodAttitude;

        public ReplaceTempWithQuery(String name, boolean hasGoodAttitude) {
            this.name = name;
            this.hasGoodAttitude = hasGoodAttitude;
        }

        public float calculateAverage(float homework, float exam) {


            if (hasGoodAttitude) {
                return mark(homework, exam) + 1;
            } else {
                return mark(homework, exam);
            }
        }


        private float mark (float homework, float exam) {
            return (homework + exam) / 2;
        }
}


/* CODI FONT
public class Student {
	private String name;
	private boolean hasGoodAttitude;

	public Student(String name, boolean hasGoodAttitude) {
		this.name = name;
		this.hasGoodAttitude = hasGoodAttitude;
	}

	public float calculateAverage(float homework, float exam) {
		float mark = (homework + exam) / 2;

		if (hasGoodAttitude) {
			return mark + 1;
		} else {
			return mark;
		}
	}
}
*/
