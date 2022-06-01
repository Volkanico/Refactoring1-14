package com.company;

public class /*Student*/ RemoveParameterAssigment {

        public float evaluateTerm(float homeworkMark, float examMark, float attitude) {

            float finalMark = 0;

            finalMark = examMark;

            if (examMark < 5) {
                finalMark = 1;
            }

            if (homeworkMark < 4) {
                finalMark += 1;
            }else {
                finalMark += homeworkMark;
            }
            return (finalMark) / 2 + attitude;
        }

}

/*
public class Student {
	public float evaluateTerm(float homeworkMark, float examMark, float attitude) {
		if (examMark < 5) {
			examMark = 1;
		}

		if (homeworkMark < 4) {
			homeworkMark = 1;
		}
		return (homeworkMark + examMark) / 2 + attitude;
	}
}
*/
