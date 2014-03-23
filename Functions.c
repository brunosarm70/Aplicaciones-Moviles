#include <stdio.h>
#include "Functions.h"

/*
 * Class:     Functions
 * Method:    sum
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_Functions_sum (JNIEnv * env, jobject obj, jint number1, jint number2)
{
	return (number1+number2);
}

/*
 * Class:     Functions
 * Method:    subtraction
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_Functions_subtraction (JNIEnv * env, jobject obj, jint number1, jint number2)
{
	return (number1-number2);
}

/*
 * Class:     Functions
 * Method:    division
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_Functions_division (JNIEnv * env, jobject obj, jint number1, jint number2)
{
	return (number1/number2);
}

/*
 * Class:     Functions
 * Method:    multiplication
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_Functions_multiplication (JNIEnv * env, jobject obj, jint number1, jint number2)
{
	return(number1*number2);
}

/*
 * Class:     Functions
 * Method:    pow
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_Functions_pow (JNIEnv * env, jobject obj, jint number1, jint number2)
{
	jint result = 1;
	
	if(number2==0)
		return 1;
	
	jint auxiliar;
	
	for(auxiliar = 0 ; auxiliar < number2; auxiliar++)
	{
		result = result * number1;
	}
	 
	return result;	
}


