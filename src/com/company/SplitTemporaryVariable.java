package com.company;

public class  /*Invoice*/ SplitTemporaryVariable {

        public float totalPrice (float price, float vat, float discount) {

            float appliedVat = (vat * price) / 100;
            System.out.println("Applied vat: " + appliedVat);
            float priceWithVat = price + appliedVat;
            System.out.println("Total with vat: " + priceWithVat);
            return priceWithVat - discount;
        }


}

/* CODI FONT
public class Invoice {
	public float totalPrice (float price, float vat, float discount) {
		float temp = 0;
		temp = (vat * price) / 100;
		System.out.println("Applied vat: " + temp);
		temp = price + temp;
		System.out.println("Total with vat: " + temp);
		return temp - discount;
	}
}
*/
