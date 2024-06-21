package org.example.gt1000;

public class T1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfiedCustomers = 0;
        int maxSatisfiedCustomers = 0;
        int additionalCustomers = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfiedCustomers += customers[i];
            }
        }

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                additionalCustomers += customers[i];
            }

            if (i >= minutes && grumpy[i - minutes] == 1) {
                additionalCustomers -= customers[i - minutes];
            }

            maxSatisfiedCustomers = Math.max(maxSatisfiedCustomers, satisfiedCustomers + additionalCustomers);
        }

        return maxSatisfiedCustomers;

    }



}
