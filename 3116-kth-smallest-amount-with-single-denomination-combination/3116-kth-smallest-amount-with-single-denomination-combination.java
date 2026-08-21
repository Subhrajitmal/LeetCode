
class Solution {
    public long findKthSmallest(int[] coins, int k) {
        Arrays.sort(coins);
        
        long low = 1;
        long high = (long) coins[0] * k;
        long result = high;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (countMultiples(mid, coins) >= k) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }

    private long countMultiples(long target, int[] coins) {
        return findCombinations(0, 1, 0, target, coins);
    }

    private long findCombinations(int index, long currentLcm, int count, long target, int[] coins) {
        if (index == coins.length) {
            if (count == 0) {
                return 0;
            }
            
            long multiples = target / currentLcm;
            
            if (count % 2 == 1) {
                return multiples;
            } else {
                return -multiples;
            }
        }

        long exclude = findCombinations(index + 1, currentLcm, count, target, coins);

        long nextLcm = lcm(currentLcm, coins[index]);
        long include = 0;
        if (nextLcm <= target) {
            include = findCombinations(index + 1, nextLcm, count + 1, target, coins);
        }

        return exclude + include;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
