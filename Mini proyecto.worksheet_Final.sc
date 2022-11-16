// Simpson 1/3
def simpson( f:Double=>Double, a:Double, b:Double):Double = {
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}
val ej01 = simpson(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
val ej02 = simpson(x => (3*math.pow(x,2)), 0,2)
val ej03 = simpson(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
val ej04 = simpson(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
val ej05 = simpson(x => (math.pow(math.E, x)), 0, 1)
val ej06 = simpson(x => (1/math.sqrt(x-1)),2,3)
val ej07 = simpson(x => (1/(1 + math.pow(x,2))),0,1)
// Simpson compuesta
def compuesta( f:Double=>Double, a:Double, b:Double):Double = {
    val n = 1000
    val h = (b-a)/n
    val x = (j: Double) => a + (j*h)
    return (1 to n/2).map(j => f(x(2*j-2))+4*f(x(2*j-1))+f((x(2*j)))).sum * h/3
}
val ej11 = compuesta(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
val ej12 = compuesta(x => (3*math.pow(x,2)), 0,2)
val ej13 = compuesta(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
val ej14 = compuesta(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
val ej15 = compuesta(x => (math.pow(math.E, x)), 0, 1)
val ej16 = compuesta(x => (1/(math.sqrt(x-1))),2,3)
val ej17 = compuesta(x => (1/(1 + math.pow(x,2))),0,1)
// Simpson Extendida
def extendida( f:Double=>Double, a:Double, b:Double):Double = {
    val n = 2*(b-a)
    val h = (b-a)/n
    val par = 2*(2 to (n-2).toInt by 2).map(j => f(a+j*h)).sum+f(b) 
    val impar = f(a) + 4*(1 to (n-1).toInt by 2).map(i => f(a+i*h)).sum 
    (h/3)* (impar + par)
}
val ej21 = extendida(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
val ej22 = extendida(x => (3*math.pow(x,2)), 0,2)
val ej23 = extendida(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
val ej24 = extendida(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
val ej25 = extendida(x => (math.pow(math.E, x)), 0, 1)
val ej26 = extendida(x => (1/(math.sqrt(x-1))),2,3)
val ej27 = extendida(x => (1/(1 + math.pow(x,2))),0,1)
//Margen de error
def margenError(valor: Double, margen: Double): Double = math.abs(margen - valor)
margenError(ej01, 7.33)
margenError(ej02, 8)
margenError(ej03, 3.333)
margenError(ej04, 1.9861)
margenError(ej05, 1.71828)
margenError(ej06, 0.828427)
margenError(ej07, 0.785398)

margenError(ej11, 7.33)
margenError(ej12, 8)
margenError(ej13, 3.333)
margenError(ej14, 1.9861)
margenError(ej15, 1.71828)
margenError(ej16, 0.828427)
margenError(ej17, 0.785398)

margenError(ej21, 7.33)
margenError(ej22, 8)
margenError(ej23, 3.333)
margenError(ej24, 1.9861)
margenError(ej25, 1.71828)
margenError(ej26, 0.828427)
margenError(ej27, 0.785398)