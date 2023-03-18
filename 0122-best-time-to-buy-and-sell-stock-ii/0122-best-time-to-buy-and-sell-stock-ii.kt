import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        return prices.toList().windowed(2).fold(0) { acc, (prev, cur) -> acc+ max(cur-prev, 0)}
    }
}