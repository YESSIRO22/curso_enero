package com.ejercicio;

public class calculaPintura {

	public static int getBucketCount(double altura, double ancho, double areaPerBucket, int extraBuckets) {
		if(altura>=0 && ancho>=0 && areaPerBucket>=0 && extraBuckets>0) {
			double pared=ancho*altura;
			double cubosPared=pared/areaPerBucket;
			int cubosTotal=(int) (Math.ceil(cubosPared)-extraBuckets);
			return cubosTotal;
		}
		else {
			return -1;
		}
	}
}
