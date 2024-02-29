fun circleAndTriangleIf(radius: Double, sideLength: Double): String {
    val triangleInCircle = radius >= sideLength * Math.sqrt(3.0) / 3 // Проверяем, помещается ли треугольник в окружность
    val circleInTriangle = sideLength >= 2 * radius // Проверяем, помещается ли окружность в треугольник

    return if (triangleInCircle) {
        if (circleInTriangle) "Окружность и треугольник могут быть размещены друг в друге"
        else "Треугольник может быть размещен внутри окружности, но окружность не поместится внутри треугольника"
    } else {
        if (circleInTriangle) "Окружность может быть размещена внутри треугольника, но треугольник не поместится внутри окружности"
        else "Окружность и треугольник не могут быть размещены друг в друге"
    }
}
