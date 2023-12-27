class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = -1
        answer = num1%num2
        return answer
    }
}
fun main(){
    val a = Solution()
    a.solution(3,2)//1
    a.solution(10,5)//0
}