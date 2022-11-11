def simpson( f:Double=>Double, a:Double, b:Double):Double = {
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}
// Simpson 1/3
simpson(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
simpson(x => (3*math.pow(x,2)), 0,2)
simpson(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
simpson(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
simpson(x => (math.pow(math.E, x)), 0, 1)
simpson(x => (1/math.sqrt(x-1)),2,3)
simpson(x => (1/(1 + math.pow(x,2))),0,1)