#include <stdio.h>
#include <stdlib.h>

// Function to update the vector
void update_vector(int* vector, int A, int B, int V) {
    for (int i = A - 1; i < B; i++) {
        vector[i] += V;
    }
}

// Function to find the GCD of a range in the vector
int find_gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    int N, Q;
    scanf("%d %d", &N, &Q);

    int* vector = (int*)malloc(N * sizeof(int));
    for (int i = 0; i < N; i++) {
        scanf("%d", &vector[i]);
    }

    for (int c = 0; c < Q; c++) {
        int query_type;
        scanf("%d", &query_type);

        if (query_type == 1) {
            int A, B, V;
            scanf("%d %d %d", &A, &B, &V);
            update_vector(vector, A, B, V);
        } else if (query_type == 2) {
            int A, B;
            scanf("%d %d", &A, &B);
            int gcd = vector[A - 1];
            for (int i = A; i < B; i++) {
                gcd = find_gcd(gcd, vector[i]);
            }
            printf("%d\n", gcd);
        }
    }

    free(vector);
    return 0;
}
