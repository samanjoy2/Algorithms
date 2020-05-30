//Sieve of Eratosthenes
//**Fast** Prime Number from 1 to 1000

import java.io.IOException;
import java.util.*;

class Sieve {
    void sieve(int n) {
        boolean []prime = new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i = 2 ; i*i<n ; i++) {
            if(prime[i]) {
                for(int j = i*i ; j<=n ; j+=i) {
                    prime[j] = false;
                }
            }
        }
        int x = 1;
        for(int i = 2; i<=n ; i++) {
            if(prime[i]) {
                System.out.print(x+" num Prime --> ");
                System.out.println(i);
                x++;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The prime numbers are: ");
        Sieve a = new Sieve();
        a.sieve(n);
    }
}
