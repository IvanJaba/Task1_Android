fun checkCircles(circle1: Pair<Pair<Int, Int>, Int>, circle2: Pair<Pair<Int, Int>, Int): String {
    val distanceBetweenCenters = Math.sqrt(
        Math.pow((circle2.first.first - circle1.first.first).toDouble(), 2.0) +
                Math.pow((circle2.first.second - circle1.first.second).toDouble(), 2.0)
    )
    val radiusDifference = circle1.second - circle2.second

    when {
        distanceBetweenCenters <= Math.abs(radiusDifference) -> {
            when {
                distanceBetweenCenters + circle2.second < circle1.second -> "Круг 2 находится внутри Круга 1"
                distanceBetweenCenters + circle1.second < circle2.second -> "Круг 1 находится внутри круга 2"
                else -> "Круги пересекаются"
            }
        }
        else -> "Круги не пересекаются"
    }
}
