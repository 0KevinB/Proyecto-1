// Simpson 1/3
def simpson( f:Double=>Double, a:Double, b:Double):Double = {
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}
simpson(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
simpson(x => (3*math.pow(x,2)), 0,2)
simpson(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
simpson(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
simpson(x => (math.pow(math.E, x)), 0, 1)
simpson(x => (1/math.sqrt(x-1)),2,3)
simpson(x => (1/(1 + math.pow(x,2))),0,1)

// Simpson compuesta
def compuesta( f:Double=>Double, a:Double, b:Double):Double = {
    val n = 200
    val h = (b-a)/n
    val x = new Array[Double](n+1)
     x(0) = a
    val j = (1 to n).map(j => x(j) = (a + h * j))
    val r = (1 to n/2).map(j => f(x(2*j-2))+4*f(x(2*j-1))+f((x(2*j)))).sum 
    (h/3)* r
}
compuesta(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
compuesta(x => (3*math.pow(x,2)), 0,2)
compuesta(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
compuesta(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
compuesta(x => (math.pow(math.E, x)), 0, 1)
compuesta(x => (1/(math.sqrt(x-1))),2,3)
compuesta(x => (1/(1 + math.pow(x,2))),0,1)

// Simpson Extendida
def extendida( f:Double=>Double, a:Double, b:Double):Double = {
    val n = 2*(b-a)
    val h = (b-a)/n
    val par = 2*(2 to (n-2).toInt by 2).map(j => f(a+j*h)).sum+f(b) 
    val impar = f(a) + 4*(1 to (n-1).toInt by 2).map(i => f(a+i*h)).sum 
    (h/3)* (impar + par)
}
extendida(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
extendida(x => (3*math.pow(x,2)), 0,2)
extendida(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
extendida(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
extendida(x => (math.pow(math.E, x)), 0, 1)
extendida(x => (1/(math.sqrt(x-1))),2,3)
extendida(x => (1/(1 + math.pow(x,2))),0,1)