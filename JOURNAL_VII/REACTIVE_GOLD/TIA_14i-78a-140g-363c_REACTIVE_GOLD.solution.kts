
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 8"
    arm(ARM6) {
        number = 1
        position = -12 to -6
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -9 to -8
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -7 to -10
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -6 to -10
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to -8
        rotation = -2
    }
    glyph(PROJECTION) {
        position = -9 to -6
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -11 to -7
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -12 to -5
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
